// Example 2: Using throw to create a custom exception.
public class Jav34b {
    public static void main(String[] args) {
        int age = 15;
        if (age < 18) {
            // Throw a custom exception
            throw new IllegalArgumentException("Age must be 18 or above");
        } else {
            System.out.println("You are eligible to vote");
        }
    }
}
