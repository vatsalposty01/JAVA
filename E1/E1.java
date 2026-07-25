public class E1
{
    static int square(int number)
    {
        return number*number;
    }
    public static void main(String[] args)
    {
        String name="vatsal";
        int age=18;
        double salary = 55000.50;
        int result=square(5);
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
        System.out.println("salary :"+salary);
        System.out.println("Square of 5 ="+ result);


        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);



        int sum = num1 + num2;
        int difference = num1 - num2;
        int multiplication = num1 * num2;
        double division = num1 / num2;

System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);

    }
}