package operator;

public class logical {

    // { && , ||,  ! }

    public static void main(String[] args) {

        int a = 5;

        if ( a > 4 && a<10){
            System.out.println("And");
        }

        else {
            System.out.println("False");
        }

        Test test = new Test();
        test.OR();
        test.Not();

    }


}

class Test {

    void And (){

        int a = 5 ;
        if ( a > 4 && a<10){
            System.out.println("And");
        }
        else {
            System.out.println("False");
        }
    }

    void  OR (){

        int a = 5 ;
        if ( a > 4 || a > 10){
            System.out.println("OR");
        }
        else {
            System.out.println("False");
        }
    }

    void Not () {
        int a = 5 ;
        if ( a != 10){
            System.out.println("NOt");
        }
        else {
            System.out.println("False");
        }
    }
}
