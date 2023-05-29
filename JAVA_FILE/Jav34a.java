// Example 1: Using try and catch to handle an ArithmeticException.
public class Jav34a {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            // This may throw an ArithmeticException
            int c = a / b;
            System.out.println("The resault is " + c);
        } catch (ArithmeticException e) {
            // Handle the exception
            System.out.println("Cannot divide by zero");
        }
    }
}
