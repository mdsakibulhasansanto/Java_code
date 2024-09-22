package operator;

public class unary {

    // increment (++a prefix) , (a++ postfix)
    // Decrement (--a prefix) , ( a-- postfix)
    public static void main(String[] args) {
        unary_Example unaryExample = new unary_Example();
        unaryExample.prefix_increment(); // First time plus
        unaryExample.postpix_increment(); // Second time plus
        unaryExample.prefix_decrement(); // First time minas
        unaryExample.postfix_decrement(); // Second time minas
    }

}

class  unary_Example {


    void  prefix_increment (){
        int a = 10;
        System.out.println(++a);
        System.out.println(++a);
    }

    void  postpix_increment (){
        int a = 10;
        System.out.println(a++);
        System.out.println(a++);
    }

    void prefix_decrement () {
        int a = 10;
        System.out.println(--a);
        System.out.println(--a);

    }
    void postfix_decrement (){
        int a = 10;
        System.out.println(a--);
        System.out.println(a--);
    }
}
