package Factorial;

public class Factorial {
    public static void main(String[] args) {

        int result = 1;

        for (int num = 1; num <= 5; num++) {

            result = result * num;
        }

        System.out.print(result);
    }
}
