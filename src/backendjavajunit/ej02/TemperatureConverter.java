package backendjavajunit.ej02;

public class TemperatureConverter {
    
    public enum Units {Celsius, Fahrenheit, Kelvin}
    public static final double MIN_CELSIUS_TEMP = -273.15;
    public static final double MIN_FAHRENHEIT_TEMP = -459.67;
    public static final double MIN_KELVIN_TEMP = 0;
    
    public double calculateCelsius (double temperature, Units units) {
        double celsiusTemp = temperature;
        
        switch (units) {
            case Fahrenheit:
                return (temperature - 32) * 5/9;
            case Kelvin:
                return temperature - 273.15;
        }
        
        return Double.max(MIN_CELSIUS_TEMP, celsiusTemp);
    }
    
    public double calculateFahrenheit (double temperature, Units units) {
        double fahrenheitTemp = temperature;
        
        switch (units) {
            case Celsius:
                return temperature * 9/5 + 32;
            case Kelvin:
                return (temperature - 273.15) * 9/5 + 32;
        }
        
        return Double.max(MIN_FAHRENHEIT_TEMP, fahrenheitTemp);
    }
    
    public double calculateKelvin (double temperature, Units units) {
        double kelvinTemp = temperature;
        
        switch (units) {
            case Fahrenheit:
                return (temperature - 32) * 5/9 + 273.15;
            case Celsius:
                return temperature + 273.15;
        }
        
        return Double.max(MIN_KELVIN_TEMP, kelvinTemp);
    }
    
}
