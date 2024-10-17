// Multilevel Inheritance ব্যবহারসূত্রক একটি program
package dp_problem;
class Father  {

    void FatherProparty (){
        int balance = 3000;
    }
}

class Mather  extends Father {
    void MatherProparty (){
        int balance = 2000;
    }
}

class Soon extends Mather {
    void PersonalProparty (){
        int balance = 1000;
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {

        Soon soon = new Soon();
        soon.PersonalProparty();
        soon.FatherProparty();
        soon.MatherProparty();

    }
}
