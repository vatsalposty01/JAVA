interface VehicleAction {
    void performAction();
}

class Vehicle {
    String name = "Honda";
    String model = "Civic";

    
    class VehicleDetails {
        void display() {
            System.out.println("--- Vehicle Details ---");
            System.out.println("Name: " + name);
            System.out.println("Model: " + model);
        }
    }
}

public class VehicleSystem {
    public static void main(String[] args) {
        
        Vehicle v = new Vehicle();
        Vehicle.VehicleDetails details = v.new VehicleDetails();
        details.display();

        
        VehicleAction action = new VehicleAction() {
            public void performAction() {
                System.out.println("Action: Starting the engine...");
            }
        };

        action.performAction();
    }
}
