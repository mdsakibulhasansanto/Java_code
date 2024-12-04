package ForLoop;

public class PrimeNumber {

    public static void main(String[] args) {

        for (int num = 2; num < 100; num++) {

            boolean isPrime = true;

            for (int n = 2; n <= num / 2; n++) {

                if (num % n == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
