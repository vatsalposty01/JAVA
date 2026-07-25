public class E2 {
    int id;
    String name;

    E2() {
        id = 509;
        name = "Vatsal";
    }

    void display() {
        System.out.println("id:" + id);
        System.out.println("name:" + name);
    }

    public static void main(String[] args) {
        E2 e = new E2();
        e.display();
    }
}