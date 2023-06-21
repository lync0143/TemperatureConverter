package org.example;

public class TemperatureConverter {
    public double convertFahrenheitToCelsius(double tempF) {
        return (tempF - 32) * 5 / 9;
    }

    public double convertCelsiusToFahrenheit(double tempC) {
        return tempC * 9 / 5 + 32;
    }
}
