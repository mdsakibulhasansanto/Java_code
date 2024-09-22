package Oop_part;

public class Abstraction {

    /*
    Abstraction অর্থ অপ্রয়োজনীয় ডিটেইল হাইড করা এবং শুধুমাত্র গুরুত্বপূর্ণ তথ্য দেখানো। Java-তে অ্যাবস্ট্রাকশন দুটি উপায়ে করা হয়
     */

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.Sound();
        Cat cat = new Cat();
        cat.Sound();
    }
}

 abstract class Animal {
    void Sound (){
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void Sound (){
        System.out.println("Dog sound");
    }
}

class Cat extends Animal {
    void Sound (){
        System.out.println("Cat sound");
    }
}
