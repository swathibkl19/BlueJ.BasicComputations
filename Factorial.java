 
import java.util.*;

import java.math.BigInteger;

public class Factorial {

    public BigInteger factorialOf(Integer value){
        System.out.println('\u000C');
        BigInteger fact =new BigInteger("1");
        
        for(int i=1;i<=value;i++)
        {
        fact=fact.multiply(BigInteger.valueOf(i));
        
    }
    System.out.println(fact);
        return fact;
    }

}
