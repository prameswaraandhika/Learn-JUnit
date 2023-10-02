import org.example.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void testMultiplySucces(){
        var result = calculator.multiply(4, 2);
        Assertions.assertEquals(8, result);
    }

    @Test
    public void testDivideByZeroSucces(){
        var result = calculator.divideByZero(4, 2);
        Assertions.assertEquals(2,result);
    }

    @Test
    public void testDivideByZeroFail(){
        Assertions.assertThrows(IllegalArgumentException.class, () ->{
           calculator.divideByZero(4, 0);
        });
    }



}
