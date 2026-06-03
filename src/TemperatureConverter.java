import java.util.Scanner;

public class TemperatureConverter {

    public static double convertTemperature(double temperature, String unit) {
        if (unit.equalsIgnoreCase("C")){
            return (temperature * 9.0 / 5.0) + 32.0;
        }

        else {
            return (temperature - 32.0) * 5.0 / 9.0;
        }
    }

    /* hint

    public static double convertTemperature(double temperature, String unit) {
        // TODO: students implement this
        return 0.0;
    }

     */

    public static void main(String[] args) {
        // TODO: students implement this
        Scanner scnr = new Scanner(System.in);

        String input = "";
        boolean running = true;

        while (running){
            System.out.print("Enter temperature value or type stop to end: ");
            input = scnr.nextLine();

            if (input.equalsIgnoreCase("stop")){
                running = false;
            }

            else if (!input.matches("-?\\d+(\\.\\d+)?")) {
                System.out.println("Error: Temperature must be a numeric value.");
            }

            else {
                double temperature = Double.parseDouble(input);

                System.out.print("Enter the unit (C or F): ");
                String unit = scnr.nextLine();

                if (unit.equalsIgnoreCase("C")){
                    double result = convertTemperature(temperature, unit);
                    System.out.printf("%.2f C = %.2f F%n", temperature, result);
                }

                else if (unit.equalsIgnoreCase("F")){
                    double result = convertTemperature(temperature, unit);
                    System.out.printf("%.2f F = %.2f C%n", temperature, result);
                }

                else {
                    System.out.println("Error: Unit must be C or F.");
                }
            }


        }

        System.out.println("Program ended.");
    }

}

