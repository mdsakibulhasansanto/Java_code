// Celsius To Fahrenheit Program

package dp_problem;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the celsius: ");
        double Celsius = scanner.nextDouble();

        // Celsius to fahrenheit convert formula this
        double Fahrenheit = (Celsius * 9 / 5) + 32;

        // Ans display
        System.out.print("Celsius to fahrenheit converted result : " + Fahrenheit);
    }
}

/*
Enter the Celsius: 25
25.0 Celsius is equal to 77.0 Fahrenheit.

 */
