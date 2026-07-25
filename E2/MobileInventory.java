public class MobileInventory {
    int modelId;
    String brandName;

    public MobileInventory() {
        modelId = 1000;
        brandName = "Iphone";
    }

    public MobileInventory(int id, String brand) {
        modelId = id;
        brandName = brand;
    }

    public MobileInventory(MobileInventory phone) {
        modelId = phone.modelId;
        brandName = phone.brandName;
    }

    void display() {
        System.out.println("Mobile ID : " + modelId);
        System.out.println("Brand Name : " + brandName);
    }

    public static void main(String[] args) {
        System.out.println("Default Constructor");
        MobileInventory Phone1 = new MobileInventory();
        Phone1.display();
        
        System.out.println("Parameterized Constructor");
        MobileInventory Phone2 = new MobileInventory(2000, "Oppo K13 Turbo");
        Phone2.display();
        
        System.out.println("Copy Constructor");
        MobileInventory Phone3 = new MobileInventory(Phone2);
        Phone3.display();
    }
}