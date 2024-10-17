
// Switch Statement ব্যবহারসূত্রক Grade নির্ণয়ের জন্য Program
package dp_problem;
import java.util.Scanner;

class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the grade {A/B/C/D/F} : ");
        String grade = scanner.nextLine();

        switch (grade) {
            case "A":
                System.out.println("Excellent");
                break;
            case "B":
                System.out.println("Good");
                break;
            case "C":
                System.out.println("Average");
                break;
            case "D":
                System.out.println("Poor");
                break;
            case "F":
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid grade point");
        }
    }
}
