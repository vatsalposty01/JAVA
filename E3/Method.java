class Calculator {

    static int count=0;

    Calculator(){
        count++;
    }
    
    int add(int n1, int n2) {
        return n1 + n2;
    }
    

    double add(double n1,double n2){
        return n1 + n2;
    }

    int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    static void displayCount(){
        System.out.println("Objects Created:"+ count);
    }

}

public class Method{

    public static void main(String[] args) {

        Calculator c1= new Calculator();
        Calculator c2= new Calculator();
        System.out.println("Addition of 2 int:"+c1.add(10,20));
        System.out.println("Addition of 2 double:"+c1.add(10.5,20.2));
        System.out.println("Addition of 3 int:"+c1.add(10,20,20));
        Calculator.displayCount();
    }

}
    
