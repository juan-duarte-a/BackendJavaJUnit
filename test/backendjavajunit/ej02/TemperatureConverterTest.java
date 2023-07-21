package backendjavajunit.ej02;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static backendjavajunit.ej02.TemperatureConverter.Units;

public class TemperatureConverterTest {
    
    static TemperatureConverter tc;
    static double temperature;
    
    @BeforeClass
    public static void setUpClass() {
        tc = new TemperatureConverter();
        temperature = 100.0;
    }

    @Test
    public void testCalculateCelsiusToCelsius() {
        assertEquals(100.0, tc.calculateCelsius(temperature, Units.Celsius), 0);
    }

    @Test
    public void testCalculateCelsiusToFahrenheit() {
        assertEquals(212.0, tc.calculateFahrenheit(temperature, Units.Celsius), 0);
    }

    @Test
    public void testCalculateCelsiusToKelvin() {
        assertEquals(373.15, tc.calculateKelvin(temperature, Units.Celsius), 0);
    }

    @Test
    public void testCalculateFahrenheitToFahrenheit() {
        assertEquals(100.0, tc.calculateFahrenheit(temperature, Units.Fahrenheit), 0);
    }

    @Test
    public void testCalculateFahrenheitToCelsius() {
        assertEquals(37.778, tc.calculateCelsius(temperature, Units.Fahrenheit), 0.001);
    }

    @Test
    public void testCalculateFahrenheitToKelvin() {
        assertEquals(310.928, tc.calculateKelvin(temperature, Units.Fahrenheit), 0.001);
    }

    @Test
    public void testCalculateKelvinToKelvin() {
        assertEquals(100.0, tc.calculateKelvin(temperature, Units.Kelvin), 0);
    }
    
    @Test
    public void testCalculateKelvinToCelsius() {
        assertEquals(-173.15, tc.calculateCelsius(temperature, Units.Kelvin), 0.01);
    }
    
    @Test
    public void testCalculateKelvinToFahrenheit() {
        assertEquals(-279.67, tc.calculateFahrenheit(temperature, Units.Kelvin), 0.01);
    }
    
}
