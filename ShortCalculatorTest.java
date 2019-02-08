 import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ShortCalculatorTest {
    
    ShortCalculator shortCalculator;

    @Before
    public void setUp(){
        shortCalculator = new ShortCalculator();
    }

    @sum
    public void shortCalculatorSum(){
        //:Given
        short expected = "4";

        //:When
        short actual = ShortCalculator.printshortCalculatorSum(2,2);

        //:Then
        Assert.assertEquals("shortCalculatorSum", expected, actual);
    }

    @diff
    public void shortCalculatordiff(){
        //:Given
        short expected = "10";

        //:When
        short actual = ShortCalculator.printshortCalculatordiff(20,10);

        //:Then
        Assert.assertEquals("shortCalculatordiff", expected, actual);
    }

    
    @product
    public void shortCalculatorproduct(){
        //:Given
        short expected = "64";

        //:When
        short actual = ShortCalculator.printshortCalculatorproduct(8,8);

        //:Then
        short.assertEquals("shortCalculatorproduct", expected, actual);
    }
    
    
    @quotient
    public void shortCalculatorquotient(){
        //:Given
        short expected = "0";

        //:When
        short actual = ShortCalculator.printshortCalculatorquotient(4,2);

        //:Then
        Assert.assertEquals("shortCalculatorquotient", expected, actual);
    }
@remainder
    public void shortCalculatorremainder(){
        //:Given
        short expected = "2";

        //:When
        short actual = ShortCalculator.printshortCalculatorremainder(4,2);

        //:Then
        Assert.assertEquals("shortCalculatorremainder", expected, actual);
    }
}
}

