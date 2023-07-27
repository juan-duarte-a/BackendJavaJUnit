package backendjavajunit.ej02;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static backendjavajunit.ej02.TemperatureConverter.Units;

public class TemperatureConverterTest {
    
    private static double temperature;
    
    @BeforeClass
    public static void setUpClass() {
        temperature = 100.0;
    }

    @Test
    public void testCalculateCelsiusToCelsius() {
        assertEquals(100.0, TemperatureConverter.calculateCelsius(temperature, Units.Celsius), 0);
    }

    @Test
    public void testCalculateCelsiusToFahrenheit() {
        assertEquals(212.0, TemperatureConverter.calculateFahrenheit(temperature, Units.Celsius), 0);
    }

    @Test
    public void testCalculateCelsiusToKelvin() {
        assertEquals(373.15, TemperatureConverter.calculateKelvin(temperature, Units.Celsius), 0);
    }

    @Test
    public void testCalculateFahrenheitToFahrenheit() {
        assertEquals(100.0, TemperatureConverter.calculateFahrenheit(temperature, Units.Fahrenheit), 0);
    }

    @Test
    public void testCalculateFahrenheitToCelsius() {
        assertEquals(37.778, TemperatureConverter.calculateCelsius(temperature, Units.Fahrenheit), 0.001);
    }

    @Test
    public void testCalculateFahrenheitToKelvin() {
        assertEquals(310.928, TemperatureConverter.calculateKelvin(temperature, Units.Fahrenheit), 0.001);
    }

    @Test
    public void testCalculateKelvinToKelvin() {
        assertEquals(100.0, TemperatureConverter.calculateKelvin(temperature, Units.Kelvin), 0);
    }
    
    @Test
    public void testCalculateKelvinToCelsius() {
        assertEquals(-173.15, TemperatureConverter.calculateCelsius(temperature, Units.Kelvin), 0.01);
    }
    
    @Test
    public void testCalculateKelvinToFahrenheit() {
        assertEquals(-279.67, TemperatureConverter.calculateFahrenheit(temperature, Units.Kelvin), 0.01);
    }
    
    @Test
    public void testCalculateCelsiusToKelvinInvalidTemperature() {
        assertEquals(TemperatureConverter.MIN_KELVIN_TEMP, TemperatureConverter.calculateKelvin(-300, Units.Celsius), 0);
    }
    
    @Test
    public void testCalculateKelvinToFahrenheitInvalidTemperature() {
        assertEquals(TemperatureConverter.MIN_FAHRENHEIT_TEMP, TemperatureConverter.calculateFahrenheit(-3, Units.Kelvin), 0);
    }
    
    @Test
    public void testCalculateFahrenheitToCelsiusInvalidTemperature() {
        assertEquals(TemperatureConverter.MIN_CELSIUS_TEMP, TemperatureConverter.calculateCelsius(-460, Units.Fahrenheit), 0);
    }
    
}
