package Practic;

import java.util.Scanner;

// বিসম বাহু ত্রিভুজের ক্ষেত্রফল
public class IsoscelesTriangle {
    public static void main (String [] args){

        Scanner santo = new Scanner(System.in);

       System.out.println("First number : ");
        double a = santo.nextDouble();

        System.out.println("Second number : ");
        int b = santo.nextInt();

        System.out.println("Third number : ");
        int c = santo.nextInt();

        double  s = (a+b+c)/2;

        double result = Math.sqrt(s*(s-a)*(s-b)*(s-c));

        System.out.print("Result = "+result);



    }

}


/*


int a = 10;
        int b = 7;
        int c = 12;

        double  s = (a+b+c)/2;

        double result = Math.sqrt(s*(s-a)*(s-b)*(s-c));

        System.out.print("Result = "+result);



 */