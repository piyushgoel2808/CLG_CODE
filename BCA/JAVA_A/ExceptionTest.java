public class ExceptionTest {
    public static void main(String[] args) {

        try {
            int a[] = new int[5];
            a[0] = 30 / 100;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurs");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        } catch (Exception e) {
            System.out.println("Parent Exception occurs");
        } finally {
            System.out.print("hello");
        }
        // System.out.println("rest of the code");
    }

    // public static void main(String[ ] args) {
    // try {
    // int[] myNumbers = {1, 2, 3};
    // System.out.println(myNumbers[10]);
    // } catch (Exception e) {
    // System.out.println("Something went wrong.");
    // }
    // }

    // public int j;

    // static void main(String args[]) {
    // for (int i = 0; i < 4; i++) {
    // try {
    // switch (i) {
    // case 0:
    // int zero = 0;
    // j = 999 / zero; // Divide by zero
    // break;
    // case 1:
    // int b[] = null;
    // j = b[0]; // Null pointer error
    // break;
    // case 2:
    // int c = new int[2];
    // j = c[10]; // Array index is out-of-bound
    // break;
    // case 3:
    // char ch = "Java".charAt(9);// String index is out-of-bound
    // break;
    // }
    // } catch (Exception e) {
    // System.out.println("In Test caset" + i + "\n");
    // System.out.println(e.getMessage());
    // }
    // }
    // }
}