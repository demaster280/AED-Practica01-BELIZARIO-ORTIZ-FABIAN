
package temperatureconverter;

public class TemperatureConverter {
    private double temperature;
    private String unit;

    public TemperatureConverter(double temperature, String unit) {
        this.temperature = temperature;
        this.unit = unit;
    }

    public double convertToFahrenheit() {
        if (unit.equalsIgnoreCase("C")) {
            return temperature * 1.8 + 32;
        } else {
            return temperature;
        }
    }

    public double convertToCelsius() {
        if (unit.equalsIgnoreCase("F")) {
            return (temperature - 32) / 1.8;
        } else {
            return temperature;
        }
    }
}

