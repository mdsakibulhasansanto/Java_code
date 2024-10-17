package dp_problem;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int Number = scanner.nextInt();

        int Factorial = 1;
        for (int x = 1; x <= Number; x ++){
            Factorial *=x ;
        }
        System.out.println(Factorial);
    }


}
