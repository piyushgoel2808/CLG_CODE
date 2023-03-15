import java.util.*;
public class HOLLOW_RECTANGLE {
    public static void main(String args[]){
        Scanner s2 = new Scanner(System.in);
        System.out.print("ENTER lenth OF RECTANGLE");
        int l = s2.nextInt();
        System.out.print("ENTER B OF RECTANGLE");
        int b = s2.nextInt();
        for(int i = 1 ; i<=l;i++){
            if (i>1 && i<l) {
                System.out.print("*");
                for (int k = 1;k<(b-1);k++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            else{
                for(int j = 1; j<=b;j++){
                    System.out.print("*");
                }
            }
                      System.out.print("\n");
        }
    }
}
