import java.util.Random;
    //This program is Written by Piyush Goel
public class A7 {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(100) + 1;
        System.out.println("The number is: " + num);
        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(num); i++) {

            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("The number is prime.");
        } else {
            System.out.println("The number is not prime.");
        }
    }
}
