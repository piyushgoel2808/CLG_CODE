public class D3 {
        //This program is Written by Piyush Goel
    static int x = 10;
    static int y;
    static {
        System.out.println("Static block initialized.");
        y = x + 5;
    }
    static void display() {
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
    public static void main(String[] args) {
        display();
    } 
}
