import java.io.*;

class Patient {
    int id;
    String name;
    int age;
    String diagnosis;

    public Patient(int pId, String pName, int pAge, String pDiagnosis) {
        id = pId;
        name = pName;
        age = pAge;
        diagnosis = pDiagnosis;
    }
}

public class PatientFile {

    public static void main(String[] args) {
        
        // Creating patient objects
        Patient p1 = new Patient(101, "Amit Sharma", 45, "Viral Fever");
        Patient p2 = new Patient(102, "Neha Singh", 32, "Migraine");

        try {
            FileWriter writer = new FileWriter("patients.txt");

            writer.write("ID: " + p1.id + ", Name: " + p1.name + ", Age: " + p1.age + ", Diagnosis: " + p1.diagnosis + "\n");
            writer.write("ID: " + p2.id + ", Name: " + p2.name + ", Age: " + p2.age + ", Diagnosis: " + p2.diagnosis + "\n");
            
            writer.close();
            System.out.println("Patient details written to patients.txt successfully.\n");
            
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        try {
            FileReader reader = new FileReader("patients.txt");
            BufferedReader br = new BufferedReader(reader);
            
            String line;
            System.out.println("--- Contents of patients.txt ---");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            
            br.close();
            reader.close();
            
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}