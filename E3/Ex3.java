class RestaurantBilling {

    static int totalOrders = 0;

   
    double calculateBill(double price, double tax) {
        totalOrders++;
        return price + tax;
    }

    double calculateBill(double price, int packagingFee) {
        totalOrders++;
        return price + packagingFee;
    }

    double calculateBill(double price, double deliveryFee, double packagingFee) {
        totalOrders++;
        return price + deliveryFee + packagingFee;
    }

    static void displayTotalOrders() {
        System.out.println("Total Orders: " + totalOrders);
    }
}

public class Ex3 {

    public static void main(String[] args) {

        RestaurantBilling billing = new RestaurantBilling();

        
        System.out.println("Dine-in Bill: " + billing.calculateBill(100.0,10.0));
        System.out.println("Takeaway Bill: " + billing.calculateBill(150.0, 2));
        System.out.println("Delivery Bill: " + billing.calculateBill(300.0, 50.0, 3.0));

        
        RestaurantBilling.displayTotalOrders();
    }
}