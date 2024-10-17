// 1+3+5 +...+ N  সিরিজ এর যোগফল নির্ণয় এর  Program
package dp_problem;

import java.util.Scanner;

public class SumOddSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter the odd series number  :  ");
        int num = scanner.nextInt();
        int Sum = 0;

        for (int x = 1; x <= num; x += 2) {
            Sum += x;
        }

        System.out.println("Sum of the odd series 1 + 3 + 5 + ... + N is : " + Sum);
    }

}

/*
Enter temperature in Celsius: 25
25.0 Celsius is equal to 77.0 Fahrenheit.

 */