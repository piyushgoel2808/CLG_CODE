public class F1 {
    //This program is Written by Piyush Goel
    public static void main(String[] args) {
        BoxWeight bw = new BoxWeight(10, 20, 30, 40);
        System.out.println("The width of the box is: " + bw.width);
        System.out.println("The height of the box is: " + bw.height);
        System.out.println("The depth of the box is: " + bw.depth);
        System.out.println("The weight of the box is: " + bw.weight);
        System.out.println("The volume of the box is: " + bw.volume());
    }
}

class Box {

    double width;
    double height;
    double depth;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxWeight extends Box {

    double weight;

    BoxWeight(double w, double h, double d, double wt) {
        super(w, h, d);
        // Initialize the weight
        weight = wt;
    }
}