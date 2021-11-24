package homework29;

public class Converter {
    public static double convertCelsiusToFahrenheit(double celsius) {
        double fahrenheit = (celsius * 1.8) + 32;
        return fahrenheit;
    }

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) / 1.8;
        return celsius;
    }

    public static double convertCelsiusToKelvin(double celsius) {
        double kelvin = celsius + 273.15;
        return kelvin;
    }

    public static double convertKelvinToCelsius(double kelvin) {
        double celsius = kelvin - 273.15;
        return celsius;
    }

    public static double convertKelvinToFahrenheit(double kelvin) {
        double fahrenheit = (kelvin * 1.8) - 459.67;
        return fahrenheit;
    }

    public static double convertFahrenheitToKelvin(double fahrenheit) {
        double kelvin = (fahrenheit + 459.67) / 1.8;
        return fahrenheit;
    }
}

