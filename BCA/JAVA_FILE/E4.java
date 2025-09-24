public class E4 {
        //This program is Written by Piyush Goel
    public static void main(String[] args) {
        Area a1 = new Area(5, 20);
        Area a2 = new Area(8);
        
    }
}
class Area{
double l,b,r;
    Area(int l, int b)
    {
        System.out.println("Area of ractangle is = " + l*b);
    }
    Area(double r)
    {
        System.out.println("Area of circle is = " + 3.14*r*r);
    }
}
