// 2+4+6+...+N  সিরিজ এর যোগফল নির্ণয় এর  Program
package dp_problem;
import java.util.Scanner;

public class SumEvenSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter the even series number  :  ");
        int Number = scanner.nextInt();
        int Sum = 0;
        for (int x = 2; x <= Number; x += 2){
            Sum += x ;
        }
        System.out.println("Sum of the even series 2 + 4 + 6 + ... + N is : " + Sum);
    }
}
