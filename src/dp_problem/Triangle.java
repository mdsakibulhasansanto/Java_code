//   Triangle নামে একটি class Declare করে ত্রিভুজের তিন বাহুর মান দিয়ে নির্ণয় করার প্রোগ্রাম
package dp_problem;

public class Triangle {

    double x, y, z;

    // Constructor crate
    Triangle(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    void CalculateArea() {
        double sum = (x + y + z) / 2;
        double result = Math.sqrt(sum * (sum - x) * (sum - y) * (sum - z));
        System.out.print("The area of the triangle : " + result);
    }

}

class TriangleArea {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(5, 10, 7);
        triangle.CalculateArea();
    }
}
