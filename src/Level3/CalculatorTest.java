package Level3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    @Test
    void testAddition(){
        Assertions.assertEquals(2,Calculator.addition(1,1));
        Assertions.assertNotEquals(10,Calculator.addition(5.8,9.66));
        Assertions.assertEquals(256,Calculator.addition(-250.3,506.3));
        Assertions.assertEquals(332,Calculator.addition(299,33));
        Assertions.assertEquals(2123,Calculator.addition(789,1334));
    }

    @Test
    void testSubtraction(){
        Assertions.assertEquals(0,Calculator.subtraction(1,1));
        Assertions.assertEquals(-15,Calculator.subtraction(11,26));
        Assertions.assertEquals(53,Calculator.subtraction(242,189));
        Assertions.assertEquals(955,Calculator.subtraction(1002,47));
        Assertions.assertEquals(653,Calculator.subtraction(852,199));
    }

    @Test
    void testMultiplication(){
        Assertions.assertEquals(1,Calculator.multiplication(1,1));
        Assertions.assertEquals(56,Calculator.multiplication(7,8));
        Assertions.assertEquals(988.8,Calculator.multiplication(9.6,103));
        Assertions.assertEquals(603,Calculator.multiplication(3,201));
        Assertions.assertEquals(126,Calculator.multiplication(18,7));
    }

    @Test
    void testDivision(){
        Assertions.assertEquals(2,Calculator.division(2,1));
        assertThrows(ArithmeticException.class, () -> {Calculator.division(1,0);});
        Assertions.assertEquals(2,Calculator.division(34,17));
        Assertions.assertEquals(0.5,Calculator.division(59,118));
        Assertions.assertEquals(3,Calculator.division(99,33));

    }

    @Test
    void testLogarithm(){
        Assertions.assertEquals(Math.log(3),Calculator.logarithm(3));
        assertThrows(ArithmeticException.class, () -> {Calculator.logarithm(-8);});
    }


}
