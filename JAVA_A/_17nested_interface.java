public class _17nested_interface {
    public static void main(String[] args) {
        B b1 = new B();
        D c1 = new D();
            b1.print();
            c1.print();
    }
}

class A {
    interface nest {
        void print();
    }
}

class B implements A.nest {
    public void print() 
        {
            System.out.println("get lost");
        }
    
}

abstract class C implements A.nest {
    // public void print() {
    //     System.out.print("get lost");
    // }
    public void print2() 
        {
            System.out.println("get lost");
        }

}

class D extends C {
    public void print() {
        System.out.print(" D1");
    }
    public void print2() 
        {
            System.out.print("D2");
        }

}