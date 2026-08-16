// Definition of the Vehicle interface
interface Vehicle {

    void start();
    void stop();
}

class Car implements Vehicle {

    public void start() {
        System.out.println("Car starting");
    }

    public void stop() {
        System.out.println("Car stopped.");
    }
}

class Bike implements Vehicle {

    public void start() {
        System.out.println("Bike starting");
    }

    public void stop() {
        System.out.println("Bike stopped.");
    }
}


public class Demo{
    public static void main(String[] args) {

        // Vehicle v1=new Vehicle(); error: Vehicle is abstract; cannot be instantiated

        Vehicle v1 = new Car();
        v1.start();
        v1.stop();

        Vehicle v2 = new Bike();
        v2.start();
        v2.stop();
    }
}