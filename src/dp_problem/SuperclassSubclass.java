//Superclass ও Subclass ব্যবহারের করে program
package dp_problem;
// Superclass
class Animal {
    void sound() {
        System.out.println("Some sound");
    }
}

// Subclass
class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}

class Main {
    public static void main(String[] args) {

        // Object create
        Dog dog = new Dog();
        dog.sound();
    }
}
