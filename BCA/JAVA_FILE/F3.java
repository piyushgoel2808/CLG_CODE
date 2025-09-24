public class F3 {
    // This program is Written by Piyush Goel
    public static void main(String args[]) {
        FinalKeyword c = new FinalKeyword();
        c.r = 5;
        c.AreaOfCircle();
    }
}

final class FinalKeyword {
    final float pi = 3.14f;
    int r;

    final public void AreaOfCircle() {
        System.out.println("area of circle: " + pi * r * r);
    }
}
