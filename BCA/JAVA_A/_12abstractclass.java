public class _12abstractclass {
    public static void main(String[] args) {
        cow c1 = new cow();
        c1.eat();
        c1.walk();
        System.out.println(c1.color);
        c1.changecolor();
        System.out.println(c1.color);
        }


}

abstract class animal{
    String color;
    animal(){
        color = "white";
    }
    void walk(){
        System.out.println("ANIMAL IS WALKING");
    }
    abstract void eat();
}
class lion extends animal{
    void eat(){
        System.out.println("meat");
    }
}
class cow extends animal{
    void changecolor(){
        color = "brown";
    }
    void eat(){
        System.out.println("grass");

    }
}


   