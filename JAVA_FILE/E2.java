public class E2 {
        //This program is Written by Piyush Goel
    public static void main(String[] args) {
        triangle t1 = new triangle(5, 50);
        System.out.println("area of triangle = "+t1.area());
    }
}
class triangle{
    int base,height;
    triangle(int b , int h){
        base = b;
        height = h;

    }
    public double area(){
        return 0.5*base*height;
    }
}
