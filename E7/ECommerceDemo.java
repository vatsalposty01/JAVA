interface Product {
    void displayDetails();
}

class BaseProduct implements Product {
    int id;
    String name;
    double price;

    public void displayDetails() {
    }
}

class ElectronicProduct extends BaseProduct {

    ElectronicProduct(int pId, String pName, double pPrice) {
        id = pId;
        name = pName;
        price = pPrice;
    }

    public void displayDetails() {
        System.out.println("\n--- Electronic Product ---");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}

class ClothingProduct extends BaseProduct {

    ClothingProduct(int pId, String pName, double pPrice) {
        id = pId;
        name = pName;
        price = pPrice;
    }

    public void displayDetails() {
        System.out.println("\n--- Clothing Product ---");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}

class GroceryProduct extends BaseProduct {

    GroceryProduct(int pId, String pName, double pPrice) {
        id = pId;
        name = pName;
        price = pPrice;
    }

    public void displayDetails() {
        System.out.println("\n--- Grocery Product ---");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}

public class ECommerceDemo {
    public static void main(String[] args) {
        ElectronicProduct laptop = new ElectronicProduct(101, "Laptop", 80000.0);
        ClothingProduct tshirt = new ClothingProduct(105, "Shirt", 750.0);
        GroceryProduct milk = new GroceryProduct(108, "Milk", 80.0);

        laptop.displayDetails();
        tshirt.displayDetails();
        milk.displayDetails();
    }
}