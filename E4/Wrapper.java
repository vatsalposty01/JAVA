public class Wrapper{

    public static void main(String[] args) {

        // Autoboxing
        int num=509;
        Integer intObj=num;

        double value= 20.67;
        Double doubleObj=value;

        // Unboxing
        int primitiveInt=intObj;
        double primitiveDouble=doubleObj;
        
        //String to Wrapper
        Integer number= Integer.valueOf("50");
        Double decimal= Double.valueOf("100.38");

        //Wrapper to String
        String str1 = intObj.toString();
        String str2 = doubleObj.toString();

        //Basic Operations

        int sum = intObj + number;
        double product = doubleObj * decimal;

        System.out.println("primitive Int: "+primitiveInt );
        System.out.println("primitive Double: "+primitiveDouble );

        System.out.println("intObj: "+intObj);
        System.out.println("doubleObj: "+doubleObj);

        System.out.println("Converted from String(Integer): "+number);
        System.out.println("Converted from String(Double): "+decimal);

        System.out.println("String value of Integer: "+str1);
        System.out.println("String value of Double: "+str2);

        System.out.println("Sum: "+sum);
        System.out.println("Product: "+product);


    }

}
    
