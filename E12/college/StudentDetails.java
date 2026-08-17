package college;

public class StudentDetails {
    String name;
    int rollNo;
    String course;

    public StudentDetails(String studentName, int studentRollNo, String studentCourse) {
        name = studentName;
        rollNo = studentRollNo;
        course = studentCourse;
    }

    public void displayStudentInfo() {
        System.out.println("Student Details");
        System.out.println("Name        : " + name);
        System.out.println("Roll Number : " + rollNo);
        System.out.println("Course      : " + course);
    }
}
