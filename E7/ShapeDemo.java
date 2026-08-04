interface Shape {
    void calculateArea();
    void displayShape();
}

class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public void displayShape() {
        System.out.println("\nDisplaying Circle with radius: " + radius);
    }

    public void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Circle Area: " + area);
    }
}


class Rectangle implements Shape {
    double width;
    double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void displayShape() {
        System.out.println("\nDisplaying Rectangle with width: " + width + " and height: " + height);
    }

    public void calculateArea() {
        double area = width * height;
        System.out.println("Rectangle Area: " + area);
    }
}

// Main Class
public class ShapeDemo {
    public static void main(String[] args) {

        Circle circle = new Circle(10.0);
        circle.displayShape();
        circle.calculateArea();

        Rectangle rectangle = new Rectangle(4.0, 6.0);
        rectangle.displayShape();
        rectangle.calculateArea();
    }
}