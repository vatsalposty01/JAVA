interface VehicleCar{
    void start();
}

class Car implements VehicleCar{
    
    public void start() {
        System.out.println("Car is starting.....");
    }
}

class ElectricCar extends Car{
    
    void charge() {
        System.out.println("Electric car is charging.....");
    }
}

public class InheritanceInterfaceDemo {
    public static void main(String[] args) {

        ElectricCar e = new ElectricCar();
        e.start();
        e.charge();
        
    }
}