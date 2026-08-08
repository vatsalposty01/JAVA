class Vehicle {
    String vehicleType = "Car";
    String model = "Honda City";
    int basePremium = 5000;

    Vehicle() {
        System.out.println("Vehicle registration details fetched.");
    }

    void displayVehicleDetails() {
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Vehicle Model: " + model);
    }
}

class CarInsurance extends Vehicle {
    int basePremium = 7500; 
    int addOnCoverage = 1500;

    CarInsurance() {
        super();
        System.out.println("Car Insurance policy generated.");
    }

    void calculateAndDisplay() {
        System.out.println("\nVehicle Details");
        
        super.displayVehicleDetails();

        System.out.println("\nPolicy Details");
       
        System.out.println("Standard Vehicle Base Premium: " + super.basePremium);
        System.out.println("Car-Specific Base Premium: " + basePremium);
        System.out.println("Add-on Coverage Fee: " + addOnCoverage);

        int totalInsuranceCost = basePremium + addOnCoverage;
        System.out.println("Total Insurance Payable: " + totalInsuranceCost);
    }
}

public class InsuranceDemo {
    public static void main(String[] args) {
        CarInsurance policy = new CarInsurance();
        policy.calculateAndDisplay();
    }
}