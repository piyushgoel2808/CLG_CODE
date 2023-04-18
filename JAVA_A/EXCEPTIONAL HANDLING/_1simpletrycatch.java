public class _1simpletrycatch {
    public static void main(String[] args) {
        // int a = 42;
        // int d = 0;
        // int c = a/d;
        // System.out.println(c);

     //   // Exception in thread "main" java.lang.ArithmeticException: / by zero
     //   // at _1simpletrycatch.main(_1simpletrycatch.java:5)

     //using try-catch
     System.out.println("this will not be printed");
     try{
        int d = 0;
        int a = 42/0;
        int x = 500/0;
        System.out.println("this will not be printed");
    }
    // System.out.println("this will not be printed");    ////will give error

        catch(ArithmeticException e){
            System.out.println("\n no is divided by (0)zero");
            // can also display exception description 
            System.out.println(" description of exception is :- "+ e);

        }
        System.out.println("after catch");
    }
}
