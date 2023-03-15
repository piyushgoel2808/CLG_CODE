import java.util.*;

public class Javaarray {
    public static int largest(int a[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > largest) {
                largest = a[i];
            }
        }
        return largest;
    }

    public static void main(String args[]) {
        int pagal[] = {5,9,5,9,98,96,99,35,0,12,34,888};
        int a = largest(pagal[]);
        System.out.print();
    }
}
