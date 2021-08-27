import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class VodenoTest
{
    @Test
    void testMultiplication()
    {
        int arg1 = 9;
        int arg2 = 5;
        int expected = 45;

        int mult = Vodeno.calc(arg1, arg2)[0];

        Assertions.assertEquals(expected, mult);
    }

    @Test
    void testDivide()
    {
        int arg1 = 9;
        int arg2 = 5;
        int expected = 1;

        int mult = Vodeno.calc(arg1, arg2)[1];

        Assertions.assertEquals(expected, mult);
    }

    @Test
    void testModulo()
    {
        int arg1 = 9;
        int arg2 = 5;
        int expected = 4;

        int mult = Vodeno.calc(arg1, arg2)[2];

        Assertions.assertEquals(expected, mult);
    }

    @Test
    void testDivideByZero()
    {
        int arg1 = 9;
        int arg2 = 0;

        Assertions.assertThrows(ArithmeticException.class, () -> Vodeno.calc(arg1, arg2));
    }

}