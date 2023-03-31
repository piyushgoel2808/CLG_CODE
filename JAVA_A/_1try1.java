import java.util.*;
public class _1try1 {

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.print("enter range : ");
        int a = s.nextInt();
        int b = s.nextInt();
        boolean is_prime = true;
        for (int i =a;i<=b;i++){
            for(int j = 2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    is_prime =false;
                }

            }
            if (is_prime==true) {
                System.out.print(i+" ,");
            }
        
        }
        
    }
}
