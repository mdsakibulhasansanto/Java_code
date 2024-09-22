package Method;

public class MethodOverloading {
    /*
    একই নামের একাধিক মেথড থাকতে পারে যদি তাদের প্যারামিটার লিস্ট ভিন্ন হয়।
    একে মেথড ওভারলোডিং বলা হয়। এটি একই কাজ ভিন্ন ভিন্ন উপায়ে করতে সাহায্য করে।
     */
    public static void main(String[] args) {

        Example_overloading exampleOverloading = new Example_overloading();
        exampleOverloading.calculate(10,20,30);
        exampleOverloading.calculate(20,10);
    }
}

class  Example_overloading {

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
