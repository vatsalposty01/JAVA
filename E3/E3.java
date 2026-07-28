class MathOperations {

    static int count = 0;
    
    int add(int n1, int n2) {
        count++;
        return n1 + n2;
    }

    double add(double n1, double n2) {
        count++;
        return n1 + n2;
    }

    int add(int n1, int n2, int n3) {
        count++;
        return n1 + n2 + n3;
    }

    static void displayCount() {
        System.out.println("Total Calculations Performed: " + count);
    }
}

public class E3 {

    public static void main(String[] args) {

        MathOperations math = new MathOperations();
        
        
        System.out.println("Addition of 2 ints: " + math.add(30, 20));
        System.out.println("Addition of 2 doubles: " + math.add(20.5, 20.2));
        System.out.println("Addition of 3 ints: " + math.add(40, 20, 50));

        MathOperations.displayCount();
    }
}