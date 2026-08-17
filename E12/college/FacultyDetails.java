package college;

public class FacultyDetails {
    String name;
    String employeeId;
    String department;

    public FacultyDetails(String facultyName, String id, String dept) {
        name = facultyName;
        employeeId = id;
        department = dept;
    }

    public void displayFacultyInfo() {
        System.out.println("Faculty Details");
        System.out.println("Name        : " + name);
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Department  : " + department);
    }
}
