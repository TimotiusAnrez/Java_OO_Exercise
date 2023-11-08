public abstract class Food {
    private String code;
    private String name;
    private int price;

    public Food(String code, String name, int price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }


    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    

    abstract String printFood();
}

class Regular extends Food{

    public Regular(String code, String name, int price) {
        super(code, name, price);
        //TODO Auto-generated constructor stub
    }        

    @Override
    public String printFood() {
        return String.format("%-10s %-20s %-10d", getCode(), getName(), getPrice());   
    }

}

class Special extends Food{

    int discount;

    public Special(String code, String name, int price, int discount) {
        super(code, name, price);
        this.discount = discount;
    }


    public int getDiscount() {
        return this.discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String printFood() {
        // TODO Auto-generated method stub
        return String.format("%-10s %-20s %-10d %-10d", getCode(), getName(), getPrice(), getDiscount()); 
    }

    
}