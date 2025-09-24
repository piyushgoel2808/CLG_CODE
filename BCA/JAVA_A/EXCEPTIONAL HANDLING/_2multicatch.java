public class _2multicatch {
    public static void main(String[] args) {
        try {
            // int a = 2;
            int a = args.length;
            System.out.println("a = " + a);
            int b = 42 / a;
            int c[] = { 1 };
            c[44] = 99;

        } 
        
        catch (ArithmeticException e) {
            System.out.println("Divide by 0:" + e);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ARRAY INDEC OOB: " + e);
        } 
        catch (Exception e) {
            System.out.println("default exception for all type of exception");
        }
    }
}
