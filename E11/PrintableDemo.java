interface Printable {
    void print();
}

class Student implements Printable {
    private String name;
    private int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public void print() {
        System.out.println("Student Details");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println();
    }
}

class Employee implements Printable {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void print() {
        System.out.println("Employee Details");
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println();
    }
}

public class PrintableDemo {
    public static void main(String[] args) {

        Printable student = new Student("Vatsal", 509);
        Printable employee = new Employee("Parth", 65000.50);

        student.print();
        employee.print();
    }
}