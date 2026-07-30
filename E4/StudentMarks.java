import java.util.Scanner;

public class StudentMarks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

       
        System.out.print("Enter Subject 1 Mark: ");
        String mark1 = sc.nextLine();

        System.out.print("Enter Subject 2 Mark: ");
        String mark2 = sc.nextLine();

        System.out.print("Enter Subject 3 Mark: ");
        String mark3 = sc.nextLine();

        Integer m1 = Integer.valueOf(mark1);
        Integer m2 = Integer.valueOf(mark2);
        Integer m3 = Integer.valueOf(mark3);

        int total = m1 + m2 + m3;

        System.out.println("\nStudent Details");
        System.out.println("Student Name: " + name);
        System.out.println("Subject 1 Mark: " + m1);
        System.out.println("Subject 2 Mark: " + m2);
        System.out.println("Subject 3 Mark: " + m3);
        System.out.println("Total Marks: " + total);

        sc.close();
    }
}