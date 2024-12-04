package SuperSub;

public class Main {

    public static void main(String[] args) {
        Soon soon = new Soon();
       soon.Proparty();
    }
}


/*

package SuperSub;

// Super class
public class Father {
    void proparty() {
        int tk = 500;
        System.out.println("Father's property: " + tk);
    }
}

// Sub class
class Soon extends Father {
    String name = "Santo";

    @Override
    void proparty() {
        int tk = 500 + 500;
        System.out.println("Son's property: " + tk);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Soon soon = new Soon(); // Subclass object তৈরি
        soon.proparty();        // Subclass মেথড কল
    }
}

 */