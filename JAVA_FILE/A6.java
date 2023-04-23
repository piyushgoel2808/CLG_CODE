public class A6 {
    //This program is Written by Piyush Goel
    public static void main(String[] args) {

        if (args.length == 2) {

            int num1 = Integer.parseInt(args[0]);

            double num2 = Double.parseDouble(args[1]);

            double sum = num1 + num2;
            System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
        } else {

            System.out.println("Please enter exactly two numbers as command-line arguments");
        }
    }
}