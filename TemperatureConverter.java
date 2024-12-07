import java.util.Scanner;

public class TemperatureConverter {
    
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Temperature Converter");
        System.out.println("Choose an option:");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");
        
        int choice = getValidChoice(scanner);
        
        System.out.print("Enter the temperature to convert: ");
        double temperature = getValidTemperature(scanner);
        
        switch (choice) {
            case 1:
                double fahrenheit = convertCelsiusToFahrenheit(temperature);
                System.out.printf("%.2f Celsius is %.2f Fahrenheit%n", temperature, fahrenheit);
                break;
            case 2:
                double celsius = convertFahrenheitToCelsius(temperature);
                System.out.printf("%.2f Fahrenheit is %.2f Celsius%n", temperature, celsius);
                break;
        }
        
        // Close the scanner
        scanner.close();
    }
    
    // Method to convert Celsius to Fahrenheit
    private static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    
    // Method to convert Fahrenheit to Celsius
    private static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    
    // Method to get a valid choice from the user
    private static int getValidChoice(Scanner scanner) {
        int choice;
        while (true) {
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice == 1 || choice == 2) {
                    break;
                } else {
                    System.out.println("Invalid choice, please enter 1 or 2.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter 1 or 2.");
            }
        }
        return choice;
    }
    
    // Method to get a valid temperature from the user
    private static double getValidTemperature(Scanner scanner) {
        double temperature;
        while (true) {
            try {
                temperature = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter a valid number for the temperature.");
            }
        }
        return temperature;
    }
}

