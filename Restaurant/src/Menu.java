import java.util.*;

public class Menu {
    int menuInput = 0;
    Scanner sc = new Scanner(System.in);
    ArrayList<Regular> regularMenu = new ArrayList<>();
    ArrayList<Special> specialMenu = new ArrayList<>();

    void printMenu(){
        System.out.println("1. Add Regular Menu");
        System.out.println("2. Add Special Menu");
        System.out.println("3. Show All Menu");
        System.out.println("4. Delete Regular Menu");
        System.out.println("5. Delete Special Menu");
        System.out.println("6 Exit");
        System.out.println("========================");
        System.out.println("Choose: ");
        menuInput = sc.nextInt();
    }

    void playMenu(){

        printMenu();

        switch (menuInput){
            case 1 : 
                addRegularMenu();
                this.menuInput = 0;
                playMenu();
            break;
            case 2 : 
                addSpecialMenu();
                this.menuInput = 0;
                playMenu();
            break;
            case 3 : 
                showAllMenu();
                this.menuInput = 0;
                playMenu();
            break;
            case 4 : 
                deleteRegularMenu();
                this.menuInput = 0;
                playMenu();
                break;
            case 5 : 
                deleteSpecialMenu();
                this.menuInput = 0;
                playMenu();
            break;
            case 6:
                System.exit(0);
            break;
            default : playMenu();
            break;
        }
    }

    public void addRegularMenu() {
        String kode = ""; //?length = 4 huruf depan nya R
        String nama = ""; //>=5 <=20
        int price = 0; //>= 10000 <=100000

        //selama kode panjangnya bukan 4 dan huruf pertamanya bukan R 
        //maka jalankan kode didalam while
        while(!(kode.length()== 4 && kode.charAt(0) == 'R')){
            System.out.println("Input menu code[R...]: ");
            kode = sc.next();
            System.out.println(" ");
        }

        while(!(nama.length() >= 5 && nama.length() <= 20)){
            System.out.println("Input menu name[5 - 20]: ");
            nama = sc.nextLine();
            System.out.println(" ");
        }
        
        while(!(price >= 10000 && price <= 100000)){
            System.out.println("Input menu price[10000 - 100000]: ");
            price = sc.nextInt();
            System.out.println(" ");
        }
        
        Regular newRegular = new Regular(kode, nama, price);
        regularMenu.add(newRegular);

        //selesai tampilin "add success"
        System.out.println("Add success");
    }

    public void addSpecialMenu(){
        String kode = ""; //? length = 4 huruf depan nya S
        String nama = ""; //? >=5 <=20
        int price = 0; //>= 10000 <=100000
        int discount = 0;

        //selama kode panjangnya bukan 4 dan huruf pertamanya bukan R 
        //maka jalankan kode didalam while
        while(!(kode.length() == 4 && kode.charAt(0) == 'S')){
            System.out.println("Input menu code[S...]: ");
            kode = sc.next();
            System.out.println(" ");
        }

        while(!(nama.length() >= 5 && nama.length() <= 20)){
            System.out.println("Input menu name[5-20]: ");
            nama = sc.next();
            System.out.println(" ");
        }
        
        while(!(price >= 10000 && price <= 100000)){
            System.out.println("Input menu price[10000 - 100000]: ");
            price = sc.nextInt();
            System.out.println(" ");
        }

        while(!(discount == 10 || discount == 25 || discount == 50)){
            System.out.println("Input menu discount[10 | 25 | 50]: ");
            discount = sc.nextInt();
            System.out.println(" ");
        }
        
        Special newSpecial = new Special(kode, nama, price, discount);
        specialMenu.add(newSpecial);

        //selesai tampilin "add success"
        System.out.println("Add success");
    }

    public void showRegular(){

        if(regularMenu.size() == 0){
            System.out.println("Regular menu doesn't have data");
            return;
        }

        //? selama i yang dimulai dari 0 itu masih dibawah size dari regularMenu
        //? lakukan kode didalem setelah itu tambahkan i dengan 1
        System.out.println("==========================================================");
        System.out.printf("%-10s %-10s %-20s %-10s\n","No.","Kode", "Nama", "Harga");
        System.out.println("===========================================================");
        for(int i = 0; i < regularMenu.size(); i++){
            //kode didalem
            System.out.printf("%-10d %s\n", i+1, regularMenu.get(i).printFood());
        }

    }

    public void showSpecial(){
        
        if(specialMenu.size() == 0){
            System.out.println("Special menu doesn't have data");
            return;
        }

        System.out.println("==========================================================");
        System.out.printf("%-10s %-10s %-20s %-10s %-10s\n","No.","Kode", "Nama", "Harga", "Diskon");
        System.out.println("===========================================================");
        for(int i = 0; i < specialMenu.size(); i++){
            //kode didalem
            System.out.printf("%-10d %s\n", i+1, specialMenu.get(i).printFood());
        }
    }

    public void showAllMenu(){
        

        showRegular();
        showSpecial();
    }

    //kalau ga ketemu harus ditanya lagi
    //kalau ketemu di delete dan loop dikelarin
    //error first callback
    public void deleteRegularMenu(){

        /**
         * tampilin semua menu reguler
         * minta input user kode menu yang mau di delete
         * validasi
         *      kalau index lebih dari sama dengan size menu nya
         *          ulangi fungsi delete regular menu
         *      kalau apa yang dinput dan kode index sekarang itu adalah sama
         *          selesaikan loopnya
         *      kalau engga semua
         *          tambahin index dengan 1
         *  remove element dari regularMenu index sekarang
         */

        showRegular();
        int index = 0; //kalau index++ aktif dia akan tambah 1
        String inputDelete="";
        int menuLength = regularMenu.size();
        //[0][1][2][3]
        System.out.println("Input code: ");
        inputDelete = sc.next(); 
        while(true){
            if(index >= regularMenu.size() ){
                System.out.println("Code is wrong !");
                deleteRegularMenu(); //apa pun yang mencegah error harus yang paling pertama
            }else if(inputDelete.equals(regularMenu.get(index).getCode())){
                System.out.println("Delete Success");
                break;
            }else{
                index ++;
            }
            
        }
        
        regularMenu.remove(index);     
    }

    public void deleteSpecialMenu(){
        showSpecial();
    }

}

