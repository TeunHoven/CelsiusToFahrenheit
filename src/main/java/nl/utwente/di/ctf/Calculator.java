package nl.utwente.di.ctf;

public class Calculator {
    public double getFahrenheit(String celsiusString) {
        double celsius = -100;
        try {
            celsius = Double.parseDouble(celsiusString);
            System.out.println(celsius);
        } catch (NumberFormatException e) {
            System.out.println("String is no number");
        }
        double fahrenheit = (celsius * 9/5) + 32;
        return fahrenheit;
    }
}
