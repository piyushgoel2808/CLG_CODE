public class jav36 {
    public static void main(String[] args) {
        int age = 17;
        try {
            // Check the age and throw an exception if it is less than 18
            if (age < 18) {
                throw new IllegalArgumentException("Age must be 18 or above");
            } else {
                System.out.println("You are eligible to vote");
            }
        } catch (IllegalArgumentException e) {
            // Handle the exception
            System.out.println(e.getMessage());
        }
    }
}
