import java.util.*;

public class Javainput {
    public static void main(String args[]) {
        System.out.print("hello");
        Scanner sc = new Scanner(System.in);   //creation of object to use input function Scanner
        String input = sc.next();     // one word input will terminate after space
        System.out.print(input+"\n"); //for next line input 

        Scanner sc2 = new Scanner(System.in);
        String name = sc2.nextLine();  //for input of line will continue even after space
        System.out.print(name+"\n");

        Scanner sc3 = new Scanner(System.in);
        int number = sc3.nextInt();  // for taking input of integer value
        System.out.print(number);
//Sme object could also be used 
        Boolean bool = sc3.nextBoolean();  // for taking input of integer value
        System.out.print(bool);
//Simlarly for float ,short,double,long ... etc and rest of the data types
// First alpabet of datatype would be capital

    }
}
