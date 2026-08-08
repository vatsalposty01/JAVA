final class College {

     void display(){

        System.out.println("College name : SIT , Pune");

     }
}
class Animal{
    final void Sound(){
        System.out.println("Animals make different Sounds.");
    }
}

class Dog extends Animal{

    void displayDog (){
        System.out.println("Dog braks.");
    }

    // void Sound(){
    //     System.out.println("Dog Sound......");
    // }
}

public class FinalDemo{

    public static void main(String a[]){
        final double pi = 3.14;

        System.out.println("pi = "+pi);

        // pi =5.20;

        Dog d = new Dog();
        d.Sound();
        d.displayDog();

        College c = new College();
        c.display();

    }
}