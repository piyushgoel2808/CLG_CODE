import java.util.*;
 
public class try123 {
    public static void main(String args[]) {
        int a = 54;
        Scanner sys = new Scanner(System.in);
       apple k1 = new kashmiri();
    //    apple a1 = new apple();
System.out.println("a/b = " + k1.b);
laptop l1 = new laptop();
pc p1 = new pc(5,6);
    }
}
 class apple {
    int b = 54;

}
class kashmiri extends apple{
    int b = 0;
}
class laptop {
    laptop(){
        System.out.println("contructor called");
    }
}
class pc {
    pc(int a1, int a2){
        System.out.println("hello"+a1+a2);
    }
}