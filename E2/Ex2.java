public class Ex2 {
    int id;
    String name;

    Ex2(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println("id:" + id);
        System.out.println("name:" + name);
    }

    public static void main(String[] args) {
        Ex2 e1 = new Ex2(509, "Vatsal");
        e1.display();
        
        Ex2 e2 = new Ex2(512, "Parth");
        e2.display();
    }
}