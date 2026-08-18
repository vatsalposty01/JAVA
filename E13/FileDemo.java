import java.io.*;

public class FileDemo {

    public static void main(String[] args) {
        
        
        try {

            FileWriter w = new FileWriter("sample.txt");
            w.write("Name : Vatsal.\n");
            w.write("Welcome to SIT , Pune\n");
            w.write("Welcome to Pune\n");
            w.close();

            System.out.println("Data written successfully.\n");

            FileReader r = new FileReader("sample.txt");
            BufferedReader br = new BufferedReader(r);

            String line;
            System.out.println("Contents of File:\n");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.err.println("File Error:"+e.getMessage());
        }
    }

}
       