package Oop_part;

public class Polymorphism {

    /*
    Polymorphism অর্থ একাধিক রূপ। এটি মেথড বা অবজেক্টগুলির একাধিক ফর্ম থাকার ক্ষমতা নির্দেশ করে।
Java-তে Polymorphism মূলত দুই প্রকার:
Compile-time Polymorphism (Method Overloading): একই মেথডের নাম থাকলেও ভিন্ন প্যারামিটার থাকে।
Run-time Polymorphism (Method Overriding): একটি চাইল্ড ক্লাস সুপারক্লাসের মেথডকে পরিবর্তন করে নতুনভাবে সংজ্ঞায়িত করতে পারে।
     */

    //
    public static void main(String[] args) {
        Example_poly examplePoly = new Example_poly();
        examplePoly.calculate(10,20,30);
        examplePoly.calculate(30,3);
    }


}



class  Example_poly {

    void calculate (int a, int b, int c){
        int num_a = a;
        int num_b = b;
        int num_c = c;
        int result =  num_a + num_b+ num_c;
        System.out.println(result);
    }

    void  calculate (int num_a,int num_b){
        int Number_a = num_a;
        int Number_b = num_b;

        double result = Number_a/Number_b;
        System.out.println(result);
    }
}
