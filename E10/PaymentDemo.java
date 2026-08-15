abstract class Payment {
    
    abstract void pay(double amount);
    
    void printReceipt() {
        System.out.println("Receipt: Transaction Successful.");
    }
}

class CreditCard extends Payment {

    void pay(double amount) {
        System.out.println("Paid " + amount + " using a Credit Card.");
    }
}

class UPI extends Payment {

    void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI.");
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        
        CreditCard card = new CreditCard();
        card.pay(1500.50);
        card.printReceipt();
        
        
        UPI upi = new UPI();
        upi.pay(450.00);
        upi.printReceipt();
    }
}