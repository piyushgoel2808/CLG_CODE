import java.util.*;

public class binary_dec {
    public static int LS(int a) {
        return a % 10;
    }

    public static void binno(int b) {
        int copy_b = b;
        int pow = 0;
        int dec_no = 0;
        while (b > 0) {
            dec_no = dec_no + (LS(b) * (int) Math.pow(2, pow));// Math.pow return double value wich is not needed so
                                                               // typr casting is done int int
            pow++;
            b = b / 10;
        }
        System.out.print("decimal of bin no :-) " + copy_b + " is :-) " + dec_no);
    }

    public static void decno(int a) {
        int copy_dec = a;
        int rem = 0;
        int b_no = 0;
        int c = 0;
        while (a > 0) {
            rem = a % 2;
            a = a / 2;
            b_no = b_no + (rem * (int) Math.pow(10, c));
            c++;

        }
        System.out.print("decimal no :-) " + copy_dec + " in binary  is :-) " + b_no);
    }

    public static void main(String args[]) {
        System.out.println(LS(10101));
        binno(1011);
        decno(11);
    }
}