 import java.util.*;


public class IntegerPrinter {

    public String printIntegerAsBinary(int value){
        System.out.print('\u000C');
        String result;
        //Scanner sc  =new Scanner(System.in);
        //value=sc.nextInt();
         result = Integer.toBinaryString(value);
         System.out.println(result);
        return result;
    }

    public String printIntegerAsOctal(int value){
        System.out.print('\u000c');
        String result;
        result = Integer.toOctalString(value);
        System.out.println(result);
        return result;
    }

    public String printIntegerAsHexadecimal(int value){
        System.out.println('\u000c');
        String result;
        result=Integer.toHexString(value);
        System.out.println(result);
        return result;
    }

    public static void main(String[] args){
        

    }
}
