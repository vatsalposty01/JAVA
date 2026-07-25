public class Exp2 {
    int id;
    String name;

    Exp2(int i, String n) {
        id = i;
        name = n;
    }

    Exp2(Exp2 s) {
        id = s.id;
        name = s.name;
    }

    void display() {
        System.out.println("id:" + id);
        System.out.println("name:" + name);
    }

    public static void main(String[] args) {
        Exp2 e1 = new Exp2(509, "Vatsal");
        e1.display();
        
        Exp2 e2 = new Exp2(e1);
        e2.display();
    }
}