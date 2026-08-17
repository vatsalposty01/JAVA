import college.*;

public class CollegeSystem {
    public static void main(String[] args) {
        System.out.println("\nCollege Management System\n");

        StudentDetails student1 = new StudentDetails("Vatsal", 509, "B.Tech Computer Science");
        
        FacultyDetails faculty1 = new FacultyDetails("Dr. Anita Desai", "EMP-705", "Computer Science");

        student1.displayStudentInfo();
        faculty1.displayFacultyInfo();
    }
}