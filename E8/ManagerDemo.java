class Employee {
    String name = "Vatsal";
    double salary = 50000;

    Employee() {
        System.out.println("Employee profile created");
    }

    void displayInfo() {
        System.out.println("Role: General Employee");
    }
}

class Manager extends Employee {
    String name = "Parth";
    double bonus = 15000;

    Manager() {
        super();
        
    }

    void showDetails() {
        
        System.out.println("Manager Name: " + name);
        System.out.println("Employee Name: " + super.name); 
        
        System.out.println("Base Salary: " + salary);
        System.out.println("Bonus: " + bonus);
        
        super.displayInfo(); 
    }
}

public class ManagerDemo {
    public static void main(String[] args) {
        System.out.println("Manager profile created");
        Manager mgr = new Manager();
        mgr.showDetails();
    }
}