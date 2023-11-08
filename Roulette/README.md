# Polymorphism

What is polymorphism means?
> poly means many
> morph means shapes
> polymorphism means many shapes and form

In java polymorphism means we do the same things with different ways.

let's say that we have a class with a bunch of methods that can be use by several type of user. Each user might have different access but the method will be more or less the same. It is going to be very redundant and confusing if we declare the same class with same attribute but with different method of access. Polymorphism can help us to solve this problem. With polymorphism we can declare a class that can be use by multiple entities but in diffrent kind of acccess and ways available to each entities.

```java
public class Animal{
    private String name;
    private String color;

    public void eat(){
        System.out.println("Munch!");
    }

    public void sleep(int hour){
        System.out.println("I want to sleep for: " + hour);
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getColor(){
        return this.color
    } 

    public void setColor(String color){
        this.color = color;
    }
}


public class Dog extends Animal{
    private int breed;

    //overiding parent method so that we can use the same class structure but with different function
    public void eat(){
        System.out.println("Munch!");
    }

    //overloading is when we are putting different parameter than the parent class intended to    
    public void sleep(String place){
        System.out.println("I want to sleep on: " + place);
    }

    public int getBreed(){
        return breed;
    }

    public int setBreed(int breed){
        this.breed = breed;
    }
}

public class Main{
    public static void main(String args[]){
        Animal dog = new Animal();

    }
}

```