public class F2 {
        //This program is Written by Piyush Goel
    public static void main(String[] args) {

        Figure fig;  //reference variable

        fig = new Rectangle(8, 10);

        System.out.println("The area of the rectangle is: " + fig.area());

        fig = new Triangle(15, 30);

        System.out.println("The area of the triangle is: " + fig.area());
    }
}
abstract class Figure {

    abstract double area();
}
class Rectangle extends Figure {
    double length;
    double width;
    Rectangle(double l, double w) {
        length = l;
        width = w;
    }
    double area() {
        return length * width;
    }
}
class Triangle extends Figure {
    double base;
    double height;
    Triangle(double b, double h) {
        base = b;
        height = h;
    }
    double area() {
        return 0.5 * base * height;
    }
}
