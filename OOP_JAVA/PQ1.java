import java.util.Scanner;

public class PQ1 {
    private String studentID;
    private String studentName;
    private String course;
    private double marks;

    public PQ1() {}

    public void getDetailsFromUser(Scanner scanner) {
        System.out.print("Enter Student ID: ");
        studentID = scanner.nextLine();

        System.out.print("Enter Student Name: ");
        studentName = scanner.nextLine();

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
        scanner.nextLine();
    }

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

    public void displayDetails() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Student ID   : " + studentID);
        System.out.println("Student Name : " + studentName);
        System.out.println("Course       : " + course);
        System.out.println("Marks        : " + marks);
        System.out.println("Grade        : " + calculateGrade());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        PQ1[] students = new PQ1[n];

        System.out.println("\n=== Enter details for " + n + " students ===");
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            students[i] = new PQ1();
            students[i].getDetailsFromUser(scanner);
        }

        System.out.println("\n=== Displaying Student Details ===");
        for (PQ1 student : students) {
            student.displayDetails();
        }

        scanner.close();
    }
}
