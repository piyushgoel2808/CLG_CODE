public class j36t {
 
        public static void main(String args[]) {
            try {
                int age = 15;
                if (age < 18) {
                    throw new UserDefinedException("Age must be at least 18!");
                } else {
                    System.out.println("Valid age!");
                }
            } catch (UserDefinedException ex) {
                System.out.println("Caught Exception: " + ex.getMessage());
            }
        }
    }
    class UserDefinedException extends Exception {
        public UserDefinedException(String message) {
            super(message);
        }
    }
    
