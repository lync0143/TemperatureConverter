package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTemperatureConverter {
    private static TemperatureConverter converter;
    @BeforeAll
    public static void setUpConverter() {
        converter = new TemperatureConverter();
    }

    @Test
    public void testBoilingFahrenheit2Celsius() {
        double expectedC = 100;
        double actualC = converter.convertFahrenheitToCelsius(212);
        assertEquals(expectedC, actualC);
    }

    @Test
    public void testFreezingFahrenheit2Celsius() {
        double expectedC = 0;
        double actualC = converter.convertFahrenheitToCelsius(32);
        assertEquals(expectedC, actualC, 0.1);
    }

    @Test
    public void testFreezingCelsius2Fahrenheit() {
        double expectedF = 32;
        double actualF = converter.convertCelsiusToFahrenheit(0.0);
        assertEquals(expectedF, actualF, 0.1);
    }
}
