package backendjavajunit.ej02;

public class TemperatureConverter {
    
    public enum Units {Celsius, Fahrenheit, Kelvin}
    public static final double MIN_CELSIUS_TEMP = -273.15;
    public static final double MIN_FAHRENHEIT_TEMP = -459.67;
    public static final double MIN_KELVIN_TEMP = 0;
    
    public static double calculateCelsius (double temperature, Units units) {
        double celsiusTemp = temperature;
        
        switch (units) {
            case Fahrenheit:
                celsiusTemp = (temperature - 32) * 5/9;
                break;
            case Kelvin:
                celsiusTemp = temperature - 273.15;
        }
        
        return Double.max(MIN_CELSIUS_TEMP, celsiusTemp);
    }
    
    public static double calculateFahrenheit (double temperature, Units units) {
        double fahrenheitTemp = temperature;
        
        switch (units) {
            case Celsius:
                fahrenheitTemp = temperature * 9/5 + 32;
                break;
            case Kelvin:
                fahrenheitTemp = (temperature - 273.15) * 9/5 + 32;
        }
        
        return Double.max(MIN_FAHRENHEIT_TEMP, fahrenheitTemp);
    }
    
    public static double calculateKelvin (double temperature, Units units) {
        double kelvinTemp = temperature;
        
        switch (units) {
            case Fahrenheit:
                kelvinTemp = (temperature - 32) * 5/9 + 273.15;
                break;
            case Celsius:
                kelvinTemp = temperature + 273.15;
        }
        
        return Double.max(MIN_KELVIN_TEMP, kelvinTemp);
    }
    
}
