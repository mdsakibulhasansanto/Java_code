package operator;

public class assignment {

    // { = , += , -= , *= , /= , >= , <= , %= }
    public static void main(String[] args) {

        int a = 10;

        if (a <= 5){
            System.out.println(" Small or  equal ");

        } else if (a >= 5) {
            System.out.println(" Big or  equal ");
        } else {
            System.out.println("False");
        }

        System.out.println(a +=5 ); // int a = a+5 = 15;
        System.out.println( a -= 5); // int a = a-5 = 10;
        System.out.println(a *= 5 ); // int a = a*5 = 25;
        System.out.println( a /= 5 ); // int a = a/5 = 2 ;
        System.out.println( a %= 3); // int a = a%3 = 1 ;

    }
}
