package Practic;
//// দ্বীঘাত সমীকরণ নির্ণয় এর পোগ্রাম
public class QuadraticEquation {

    public static void main (String [] args) {

        // ax+bx+c = 0

        double a = 1;
        double b = -2;
        double c = 1;

        double d = (b*b) - 4*a*c;

        if (d > 0) {

            double result_a = (-b + Math.sqrt(d)) / (2 * a);
            double result_b =  (-b - Math.sqrt(d)) / (2*a);

            System.out.println(result_a);
            System.out.println(result_b);
        }
        else if (d == 0) {

            double equation = -b / (2*a);
            System.out.println(equation);
        }

        else {
            System.out.print("Error");
        }


    }
}


/*
a এর মান দিন: 1
b এর মান দিন: -2
c এর মান দিন: 1
ans
দুইটি বাস্তব ও সমান মূল:
x = 1.00

 */