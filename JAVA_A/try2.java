import java.util.*;

public class try2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no  : ");
        int no = sc.nextInt();
        boolean is_prime = true;
        if (no == 2) {
            is_prime = true;
        } 
        else {
            for (int i = 2; i <= no - 1; i++) {
                if (no % i == 0) {
                    is_prime = false;
                }

            }
        }
        if (is_prime==true) {
            System.out.print("Prime no");
        }
        else{
            System.out.print("not a prime no");
        }
    }
}
