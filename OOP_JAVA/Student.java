public class Student {
    String name;
    double totalMarks;
    double mathsMarks;

    // Constructor
    public Student(String name, double totalMarks, double mathsMarks) {
        this.name = name;
        this.totalMarks = totalMarks;
        this.mathsMarks = mathsMarks;
    }

    // Method to check scholarship eligibility
    public boolean isEligibleForScholarship() {
        return (totalMarks > 90) && (mathsMarks > 85);
    }

    // Method to display result
    public void displayEligibility() {
        if (isEligibleForScholarship()) {
            System.out.println(name + " is eligible for the scholarship.");
        } else {
            System.out.println(name + " is not eligible for the scholarship.");
        }
    }

    // Main method
    public static void main(String[] args) {
        Student s1 = new Student("Piyush", 92.5, 88);
        Student s2 = new Student("Bob", 89, 90);
        Student s3 = new Student("Charlie", 95, 83);

        s1.displayEligibility();
        s2.displayEligibility();
        s3.displayEligibility();
    }
}

