public class Jav34c {
    public static void main(String args[]) {
        try {
            int result = divide(10, 0); // Divide by zero
            System.out.println("Result: " + result);
        } catch (ArithmeticException ex) {
            System.out.println("Caught Exception: " + ex.getMessage());
        } finally {
            System.out.println("Inside finally block");
        }
    }
    public static int divide(int dividend, int divisor) {
        return dividend / divisor;
    }
}
