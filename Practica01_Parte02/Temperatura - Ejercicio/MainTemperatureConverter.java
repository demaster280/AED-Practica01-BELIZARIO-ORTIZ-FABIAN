
package temperatureconverter;

import java.util.Scanner;


public class MainTemperatureConverter {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una temperatura: ");
        double temperature = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Ingrese la unidad (Celsius o Fahrenheit): ");
        String unit = scanner.nextLine();
        TemperatureConverter converter = new TemperatureConverter(temperature, unit);
        if (unit.equalsIgnoreCase("C")) {
            System.out.println(temperature + " grados Celsius son " + converter.convertToFahrenheit() + " grados Fahrenheit.");
        } else {
            System.out.println(temperature + " grados Fahrenheit son " + converter.convertToCelsius() + " grados Celsius.");
        }
    }
}

