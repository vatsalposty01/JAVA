abstract class Shape{
    abstract void draw();
    void display(){
        System.out.println("This is a Shape");
    }
}

class Circle extends Shape{

    void draw(){
        System.out.println("Drawing a Circle.");
    }
}

class Rectangle extends Shape{
    void draw(){
        System.out.println("Drawing a Rectangle.");
    }
}

public class Demo{
    public static void main(String a[]){
        // Shape s = new Shape();
        Circle c = new Circle();
        c.draw();
        Rectangle r = new Rectangle();
        r.draw();
    }
}