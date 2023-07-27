package backendjavajunit.ej02;

public class TemperatureConverter {
    
    public enum Units {Celsius, Fahrenheit, Kelvin}
    
    public static double calculateCelsius (double temperature, Units units) {
        double celsiusTemp = temperature;
        
        switch (units) {
            case Fahrenheit:
                return (temperature - 32) * 5/9;
            case Kelvin:
                return temperature - 273.15;
        }
        
        return celsiusTemp;
    }
    
    public static double calculateFahrenheit (double temperature, Units units) {
        double fahrenheitTemp = temperature;
        
        switch (units) {
            case Celsius:
                return temperature * 9/5 + 32;
            case Kelvin:
                return (temperature - 273.15) * 9/5 + 32;
        }
        
        return fahrenheitTemp;
    }
    
    public static double calculateKelvin (double temperature, Units units) {
        double kelvinTemp = temperature;
        
        switch (units) {
            case Fahrenheit:
                return (temperature - 32) * 5/9 + 273.15;
            case Celsius:
                return temperature + 273.15;
        }
        
        return kelvinTemp;
    }
    
}
