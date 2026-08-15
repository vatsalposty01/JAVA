abstract class FoodOrder {
    
    abstract void calculateBill(double amount);
    
    void printOrderInfo() {
        System.out.println("Processing your food order...");
    }
}

class DineInOrder extends FoodOrder {
    
    void calculateBill(double amount) {
        double serviceCharge = amount * 0.10; 
        double total = amount + serviceCharge;
        System.out.println("Dine-In Total Bill (with 10% service charge): " + total);
    }
}

class TakeAwayOrder extends FoodOrder {
    
    void calculateBill(double amount) {
        double packagingFee = amount * 0.05; 
        double total = amount + packagingFee;
        System.out.println("Take-Away Total Bill (with 5% packaging fee): " + total);
    }
}

public class FoodOrderDemo {
    public static void main(String[] args) {
        
        DineInOrder dineIn = new DineInOrder();
        dineIn.printOrderInfo();
        dineIn.calculateBill(500.00);
        
        
        TakeAwayOrder takeAway = new TakeAwayOrder();
        takeAway.printOrderInfo();
        takeAway.calculateBill(500.00);
    }
}