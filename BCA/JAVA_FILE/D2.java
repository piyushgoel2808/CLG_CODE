public class D2 {
        //This program is Written by Piyush Goel
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.SE(t1);
        t1.a = 100; //usage of reference variables.
        t1.b = 200;
        t1.SE(t1);
    }
    
}
class Test{
    int a = 55;
    int b = 99;
    public void SE(Test t){
        System.out.print("\na ="+a +"\nb ="+b);
    }
}
