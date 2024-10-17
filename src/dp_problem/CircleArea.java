//  CIRCLE নামে একটি class Declare করে বৃত্তের ক্ষেত্রফল নির্ণয়ের প্রোগ্রাম
package dp_problem;
class Circle {
    double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Return type function
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Main class
public class CircleArea {
    public static void main(String[] args) {

        // Object crate and function call
        Circle circle = new Circle(5.0);
        double area = circle.calculateArea();
        System.out.println("The area of the circle :  " + area);
    }
}
