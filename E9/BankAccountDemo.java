class BankAccount {
    final int accountNumber;
    String name;
    double balance;

    BankAccount(int accNum, String holderName, double startBalance) {
        accountNumber = accNum;
        name = holderName;
        balance = startBalance;
    }

    void display() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Name           : " + name);
        System.out.println("Balance        : " + balance);
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount(509, "Vatsal", 3000.0);
        acc.display();

    }
}