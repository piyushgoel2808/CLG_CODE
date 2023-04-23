// The Thread class 
// Below are the commonly used constructors of the thread class: 

// Thread ( ) 
// Thread ( string ) 
// Thread ( Runnable r )
// Thread ( Runnable r, String name ) 

public class _22_thread_constructor {
    
    public static void main(String[] args) {
        MyThr t1 = new MyThr("PIYUSH");
        MyThr t2 = new MyThr("GOEL");
        t1.start();
        t2.start();
        System.out.println("The id of the thread t1 is " + t1.getId());
        System.out.println("The name of the thread t1 is " + t1.getName());
        System.out.println("The id of the thread t2 is " + t2.getId());
        System.out.println("The name of the thread t2 is " + t2.getName());
    
        }
}
class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
//     public void run(){
//         // int i = 34;
//         System.out.println("Thank you");
// //        while(true){
// //            System.out.println("I am a thread");
// //        }
//     }
}
