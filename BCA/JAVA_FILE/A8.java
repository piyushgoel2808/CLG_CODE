import java.util.Random;
    //This program is Written by Piyush Goel
public class A8 {
    
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(90) + 10;
        System.out.println("The number is: " + num);
        int digit1 = num / 10; 
        int digit2 = num % 10;
        int sum = (digit1 * digit1 * digit1) + (digit2 * digit2 * digit2);

        if (sum == num) {
            System.out.println("The number is Armstrong.");
        } else {
            System.out.println("The number is not Armstrong.");
        }
    }
}
