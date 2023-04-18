public class A6 {
    public static void main(String[] args) {
      // Check if there are exactly two command-line arguments
      if (args.length == 2) {
        // Convert the first argument to an int value
        int num1 = Integer.parseInt(args[0]);
        // Convert the second argument to a double value
        double num2 = Double.parseDouble(args[1]);
        // Calculate and print the sum of the two numbers
        double sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
      } else {
        // Print an error message if there are not exactly two arguments
        System.out.println("Please enter exactly two numbers as command-line arguments");
      }
    }
  }