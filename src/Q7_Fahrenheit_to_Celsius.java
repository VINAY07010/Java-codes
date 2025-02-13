import java.util.Scanner;

public class Q7_Fahrenheit_to_Celsius {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        // Enter temperature in degree fahrenheit.
        System.out.println("Enter temperature in degree fahrenheit: ");
        double fahrenheit = Sc.nextDouble();

        // Calculate and convert in degree celsius.
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Display the result.
        System.out.printf("Temperature in Celsius: %.2f°C%n", celsius);
    }
}
