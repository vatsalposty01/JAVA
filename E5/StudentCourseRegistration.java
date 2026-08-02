import java.util.ArrayList;
import java.util.Scanner;

public class StudentCourseRegistration {

    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add Course");
            System.out.println("2. Remove Course");
            System.out.println("3. Display Courses");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter course name: ");
                    courses.add(sc.nextLine());
                    System.out.println("Course added successfully.");
                    break;

                case 2:
                    System.out.print("Enter course name to remove: ");
                    String courseToRemove = sc.nextLine();
                    if (courses.remove(courseToRemove)) {
                        System.out.println("Course removed successfully.");
                    } else {
                        System.out.println("Course not found.");
                    }
                    break;

                case 3:
                    StringBuffer sb = new StringBuffer();
                    sb.append("\n--- REGISTERED COURSES ---\n");
                    for (int i = 0; i < courses.size(); i++) {
                        sb.append(i + 1).append(". ").append(courses.get(i)).append("\n");
                    }
                    System.out.println(sb.toString());
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);

        sc.close();
    }
}