package dp_problem;

public class Inheritance {
    public static void main(String[] args) {

        InSoon soon = new InSoon();
        soon.result();
    }
}

class  InFather {

    void  result (){
        int proparty = 100;

    }
}

class  InSoon extends InFather {

    void  result (){
        int proparty = 10;
        System.out.println(proparty);
    }
}

