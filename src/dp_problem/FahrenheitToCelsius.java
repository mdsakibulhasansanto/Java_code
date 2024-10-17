
// Fahrenheit To Celsius converted program
package dp_problem;
import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Fahrenheit : ");
        double fahrenheit = scanner.nextDouble();

        //  fahrenheit to celsius  convert formula this
        double celsius = (fahrenheit - 32) * 5/9;

        // Ans display
        System.out.print("Fahrenheit to Celsius converted result : " + celsius);
    }
}

/*
Enter the Fahrenheit: 77
77.0 Fahrenheit is equal to 25.0 Celsius.

 */
