public class Expriment2 {
    int id;
    String name;

    Expriment2() {
        id = 509;
        name = "Vatsal";
    }

    Expriment2(int i, String n) {
        id = i;
        name = n;
    }

    Expriment2(Expriment2 s) {
        id = s.id;
        name = s.name;
    }

    void display() {
        System.out.println("id:" + id);
        System.out.println("name:" + name);
    }

    public static void main(String[] args) {
        System.out.println("Default Constructor");
        Expriment2 e = new Expriment2();
        e.display();
        
        System.out.println("Parameterized Constructor");
        Expriment2 e1 = new Expriment2(512, "Parth");
        e1.display();
        
        System.out.println("Copy Constructor");
        Expriment2 e2 = new Expriment2(e1);
        e2.display();
    }
}