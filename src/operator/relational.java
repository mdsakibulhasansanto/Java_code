package operator;

public class relational {

    // { == , != , > , < , >= , <= }
    public static void main(String[] args) {

        Example example = new Example();
        example.equal();
        example.notEqual();
        example.getterThen();
        example.lessThen();


    }
}

class Example {

    int a = 10;

    void equal() {

        if (a == 5) {
            System.out.println("It's true ");
        } else {
            System.out.println("It's false ");
        }

        // Ans false
    }

    void notEqual() {

        if (a != 6) {
            System.out.println("It's true ");
        } else {
            System.out.println("It's false ");
        }
        // Ans true
    }

    void getterThen() {

        if (a > 6) {
            System.out.println("It's true ");
        } else {
            System.out.println("It's false ");
        }
        // Ans true
    }

    void lessThen() {

        if (a < 6) {
            System.out.println("It's true ");
        } else {
            System.out.println("It's false ");
        }
        // Ans true
    }

    void getterThenOrEqual() {
        if (a >= 6) {
            System.out.println("It's true ");
        } else {
            System.out.println("It's false ");
        }
        // Ans true
    }

    void lessThenOrEqual() {

        if (a <= 6) {
            System.out.println("It's true ");
        } else {
            System.out.println("It's false ");
        }
        // Ans false
    }
}


