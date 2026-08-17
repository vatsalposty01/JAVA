import mypackage.*;

public class Demo {
    public static void main(String[] args) {

        int a = 50;
        int b = 10;
        
        Calculator c = new Calculator();
        int sum = c.add(a, b);
        System.out.println("sum of a and b: " + sum);

        int multiply = c.multiply(a, b);
        System.out.println("multiply of a and b: " + multiply);

        int subtract = c.subtract(a, b);
        System.out.println("subtract of a and b: " + subtract);

        double division = c.division(a, b);
        System.out.println("division of a and b: " + division);

    }
}