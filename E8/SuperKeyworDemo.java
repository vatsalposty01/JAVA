class Animal{
    String color="White";
    Animal(){
        System.out.println("Animal constructor");
    }

    void sound(){
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal{
    String color="Black";
    Dog(){
        super();
        System.out.println("Dog constructor");
    }

    void display(){
        System.out.println("Dog color: "+color);
        System.out.println("Animal color: "+super.color);
        super.sound();
    }
}

public class SuperKeyworDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.display();
    }
}