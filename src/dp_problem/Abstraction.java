package dp_problem;
public class Abstraction {

    public static void main(String[] args) {
        AbDog dog = new AbDog();
        dog.Sound();
        Cat cat = new Cat();
        cat.Sound();
    }
}

abstract class AbAnimal {
    void Sound (){
        System.out.println("Animal sound");
    }
}

class AbDog extends AbAnimal {
    void Sound (){
        System.out.println("Dog sound");
    }
}

class Cat extends AbAnimal {
    void Sound (){
        System.out.println("Cat sound");
    }
}


    /*
    Abstraction অর্থ অপ্রয়োজনীয় ডিটেইল হাইড করা এবং শুধুমাত্র গুরুত্বপূর্ণ তথ্য দেখানো। Java-তে অ্যাবস্ট্রাকশন দুটি উপায়ে করা হয়
     */

