package nl.utwente.di.ctf;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/** Test the Quoter **/
public class testCalc {
    @Test
    public void testCalculator0() throws Exception {
        Calculator calc = new Calculator();
        double fahr = calc.getFahrenheit("7");
        Assertions.assertEquals(44.6, fahr, 0.0, "Fahrenheit of 0 Celsius");
    }
}
