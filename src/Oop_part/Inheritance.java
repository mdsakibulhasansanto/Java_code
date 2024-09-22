package Oop_part;

public class Inheritance {
    public static void main(String[] args) {

        Soon soon = new Soon();
        soon.result();
    }
}

class  Father {

    void  result (){
        int proparty = 100;

    }
}

class  Soon extends Father {

    void  result (){
        int proparty = 10;
        System.out.println(proparty);
    }
}

