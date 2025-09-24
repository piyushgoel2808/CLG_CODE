public class D1 {
        //This program is Written by Piyush Goel
    public static void main(String[] args) {
        Box b1 = new Box();
        System.out.print("Volume of box = ");
        b1.volume(2,3,1);
    }
}

class Box{
    public void volume(int l, int h, int w){
        System.out.print(l*w*h);
    }
}

