public class E3 {
        //This program is Written by Piyush Goel
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 8);
        System.out.println("area of Rectangle = "+ r1.area());
    }
}
class Rectangle{
    int l ,b ;
    Rectangle(int l , int b){
        this.l = l;
        this.b = b;

    }
    public double area(){
        return l*b;
    }
}
