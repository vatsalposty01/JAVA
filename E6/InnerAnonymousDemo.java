class College{

    String  CollegeName = "SIT Pune";

    class Student{

        void display(){
            System.out.println("Student belongs to "+CollegeName);
        }
    }
}

interface Greeting{
    void Sayhello();
}

public class InnerAnonymousDemo{
    public static void main(String[] args) {
        
        College c = new College();
        College.Student s = c.new Student();
        s.display();

        Greeting g =new Greeting(){

            public void Sayhello(){
                System.out.println("hey from Anonymous Class");
            }

        };

        g.Sayhello();

    }
}