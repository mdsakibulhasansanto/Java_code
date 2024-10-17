// দ্বীঘাত সমীকরণ নির্ণয় এর পোগ্রাম
package dp_problem;

import java.util.Scanner;

public class QuadraticEquation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter value  a : ");
        double a = input.nextDouble();

        System.out.print("Enter value  b : ");
        double b = input.nextDouble();

        System.out.print("Enter value  c : ");
        double c = input.nextDouble();

        double Discriminant = b * b - 4 * a * c;

        if (Discriminant > 0) {
            // দুটি বাস্তব এবং পৃথক মূল
            double root1 = (-b + Math.sqrt(Discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(Discriminant)) / (2 * a);
            System.out.println("First root : " + root1);
            System.out.println("Second root : " + root2);

        } else if (Discriminant == 0) {
            // দুটি বাস্তব এবং সমান মূল
            double root = -b / (2 * a);
            System.out.println("The roots are real and equal : " + root);
        } else {
            // কাল্পনিক মূল।
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-Discriminant) / (2 * a);
            System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
        }


    }
}

/*


 */
