import java.util.Scanner;

public class PQ3 {
    private String studentName;
    private double marks;

    public PQ3(String studentName, double marks) {
        this.studentName = studentName;
        this.marks = marks;
    }

    public char calculateGrade() {
        int gradeKey = (int) marks / 10;
        char grade;
        switch (gradeKey) {
            case 10: // For marks = 100
            case 9:
                grade = 'A';
                break;
            case 8:
            case 7:
                grade = 'B';
                break;
            case 6:
                grade = 'C';
                break;
            default:
                grade = 'F';
        }
        return grade;
    }

    public void displayResult() {
        System.out.println("\n--- Student Result ---");
        System.out.println("Student Name : " + studentName);
        System.out.println("Marks        : " + marks);
        System.out.println("Grade        : " + calculateGrade());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        PQ3[] students = new PQ3[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            System.out.print("Enter Student Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Marks (0–100): ");
            double marks = scanner.nextDouble();
            scanner.nextLine(); // consume newline

            students[i] = new PQ3(name, marks);
        }

        System.out.println("\n=== Student Results ===");
        for (PQ3 student : students) {
            student.displayResult();
        }

        scanner.close();
    }
}
