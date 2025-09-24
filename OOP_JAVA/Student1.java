import java.util.Scanner;

public class Student1 {
    // Data members
    private String studentID;
    private String studentName;
    private String course;
    private double marks;

    // Method to take details from user
    public void getDetailsFromUser(Scanner scanner) {
        System.out.print("Enter Student ID: ");
        studentID = scanner.nextLine();

        System.out.print("Enter Student Name: ");
        studentName = scanner.nextLine();

        // Validation for empty ID and Name
        while (studentID.isEmpty() || studentName.isEmpty()) {
            System.out.println("Student ID and Name cannot be empty. Please re-enter.");
            System.out.print("Enter Student ID: ");
            studentID = scanner.nextLine();
            System.out.print("Enter Student Name: ");
            studentName = scanner.nextLine();
        }

        System.out.print("Enter Course Name: ");
        course = scanner.nextLine();

        System.out.print("Enter Marks (0-100): ");
        marks = scanner.nextDouble();
        scanner.nextLine(); // consume newline
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Student ID   : " + studentID);
        System.out.println("Student Name : " + studentName);
        System.out.println("Course       : " + course);
        System.out.println("Marks        : " + marks);
        System.out.println("Grade        : " + calculateGrade());
    }

    // Method to calculate grade
    public String calculateGrade() {
        if (marks >= 75) {
            return "Distinction";
        } else if (marks >= 60) {
            return "Merit";
        } else if (marks >= 40) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[10];

        System.out.println("=== Enter details for 10 students ===");
        for (int i = 0; i < students.length; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            students[i] = new Student(); // Create a new Student object
            students[i].getDetailsFromUser(scanner);
        }

        System.out.println("\n=== Displaying Student Details ===");
        for (Student student : students) {
            student.displayDetails();
        }

        scanner.close();
    }
}
