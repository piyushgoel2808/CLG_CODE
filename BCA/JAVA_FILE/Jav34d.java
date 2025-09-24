// Example 4: Using finally to execute some code after the try-catch blocks.
public class Jav34d {
    public static void main(String[] args) {
        try {
            // This may throw an ArrayIndexOutOfBoundsException
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the exception
            System.out.println("Invalid index");
        } finally {
            // This code is always executed
            System.out.println("This is the finally block");
        }
    }
}
