
// Define a custom exception class that extends Exception
public class InvalidAgeException extends Exception {
    // Constructor that takes a message as an argument
    public InvalidAgeException(String message) {
        // Call the super class constructor with the message
        super(message);
    }
}

public class Jav25 {
    public static void main(String[] args) {
        int age = 15;
        try {
            // Check the age and throw an exception if it is invalid
            if (age < 18) {
                throw new InvalidAgeException("Age must be 18 or above");
            } else {
                System.out.println("You are eligible to vote");
            }
        } catch (InvalidAgeException e) {
            // Handle the custom exception
            System.out.println(e.getMessage());
        }
    }
}
