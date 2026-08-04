interface DeliveryStatus {
    void updateStatus();
}

class FoodDeliveryApp {
    String restaurantName = "Pizza Planet";

   
    class OrderDetails {
        int orderId;
        String item;

        OrderDetails(int orderId, String item) {
            this.orderId = orderId;
            this.item = item;
        }

        void displayOrder() {
            System.out.println("--- Order Details ---");
            System.out.println("Order ID: " + orderId);
            System.out.println("Restaurant: " + restaurantName);
            System.out.println("Item Ordered: " + item);
        }
    }
}

public class FoodDelivery {
    public static void main(String[] args) {
        
        
        FoodDeliveryApp app = new FoodDeliveryApp();
        FoodDeliveryApp.OrderDetails order = app.new OrderDetails(1042, "Large Pizza");
        order.displayOrder();

        
        DeliveryStatus statusUpdate = new DeliveryStatus() {
            public void updateStatus() {
                System.out.println("Status Update: Your food has been picked up and is on the way!");
            }
        };

        statusUpdate.updateStatus();
    }
}