import javax.swing.event.SwingPropertyChangeSupport;

public class _13interface1 {
    public static void main(String[] args) {
        herbivorus h1 = new herbivorus() {

        };
        h1.print();
        lion l1 = new lion();
        l1.eat();
        raccoons r1 = new raccoons();
        System.out.println("raccoons");
        r1.eat();
        r1.print();

        humans H1 = new humans();
        System.out.println("humanss");
        H1.eat();
        H1.print();
        H1.print2();


    }
}
 class organism {
    // void print(){
    // System.out.println("organism");
    // }
    void print() {
        System.out.println("organism");
    }
}

abstract class herbivorus extends organism {
    void print() {
        System.out.println("herbs");
    }

    void print2() {
        System.out.println("herbs");
    }
}



interface carnivorus {
    // it wont work as interface dont allow /

    // void print2(){
    // System.out.println("herbs");
    // }

    void eat();
}


class lion implements carnivorus {
    public void eat() { // it is neccary to declare public another wise it will go to default
        System.out.println("meat (lion)");
    }
}

// class Bear implements lion{              //The type lion cannot be a superinterface of Bear; a superinterface must be an interface
//     public void eat(){           
//         System.out.println("meat (Bear)");
//     }
// }

// class tiger extends carnivorus {             //The type carnivorus cannot be the superclass of tiger; a superclass must be a CLASS not interface 
//     public void eat() { 
//         System.out.println("meat (lion)");
//     }
// }



interface omnivorus extends carnivorus{     
    void print() ;
}
class raccoons implements omnivorus{
    public void eat(){
        System.out.println("eat from carnivorus");
    }
    public void print(){
        System.out.println("print ");
    }
}
interface omni2 extends omnivorus{
    void print2();
}
class humans implements omni2{
    public void print2()
    {
        System.out.println("human print 2");
    }
    public void eat(){
        System.out.println("HUMAN eat from carnivorus");
    }
    public void print(){
        System.out.println("HUMAN print ");
    }
} 