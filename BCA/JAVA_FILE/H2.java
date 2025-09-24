//This program is Written by Piyush Goel
interface Outer {
    void outerMethod();

    interface Inner {
        void innerMethod();
    }
}

class MyClass implements Outer.Inner {
    public void innerMethod() {
        System.out.println("This is inner interface method");
    }
}

public class H2 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.innerMethod();
    }
}