import java.util.ArrayList;
import java.util.Scanner;


class Student {
    int roll;
    String name;

    // Constructor
    Student(int id, String name) {
        this.roll = id;
        this.name = name;
    }
}

 class CollegeManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.println(" College Management System ");
        System.out.println("1. Add Student");
        System.out.println("2. View Students");
        System.out.println("3. Exit");

        for (int i = 0; i < 100; i++) {
            System.out.print("\nEnter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Enter Student Roll : ");
                String idInput = scanner.nextLine();
                int roll = Integer.parseInt(idInput);
                System.out.print("Enter Student Name: ");
                String name = scanner.nextLine();

                students.add(new Student(roll, name));
                System.out.println("Student added successfully");
            } else if (choice == 2) {
                System.out.println("\nStudent List");
                if (students.isEmpty()) {
                    System.out.println("No students added  ");
                } else {

                    for (int j = 0; j < students.size(); j++) {
                        Student student = students.get(j);
                        System.out.println("ID: " + student.roll + ", Name: " + student.name);
                    }
                }
            } else if (choice == 3) {
                System.out.println("Exiting code ");
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }
    }
}
