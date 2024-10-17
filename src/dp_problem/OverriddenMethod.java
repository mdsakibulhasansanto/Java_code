// Overridden Method ব্যবহারের করে একটি Program
package dp_problem;
class Parent {
    void show() {
        System.out.println("Parent's show()");
    }
}

class Sub extends Parent {
    // Method overriding
    void show() {
        System.out.println("Child's show()");
    }
}

public class OverriddenMethod {
    public static void main(String[] args) {
        Parent parent = new Sub();
        parent.show();
    }
}
