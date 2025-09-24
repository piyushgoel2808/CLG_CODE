public class Result {
    String studentName;
    double marks;

    // Constructor
    public Result(String studentName, double marks) {
        this.studentName = studentName;
        this.marks = marks;
    }

    // Method to categorize result
    public String categorizeResult() {
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

    // Method to display result
    public void displayResult() {
        String category = categorizeResult();
        System.out.println(studentName + " has secured: " + category);
    }

    // Main method
    public static void main(String[] args) {
        Result r1 = new Result("Piyush", 82.5);
        Result r2 = new Result("Bob", 68);
        Result r3 = new Result("Charlie", 55);
        Result r4 = new Result("Diana", 35);

        r1.displayResult();
        r2.displayResult();
        r3.displayResult();
        r4.displayResult();
    }
}
