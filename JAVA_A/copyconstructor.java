public class copyconstructor {
    public static void main(String arge[]){
        System.out.println("This is a program is made by PIYUSH GOEL");
        System.out.println("\n############### NON PARAMETRIZED CONSTRUCTOR ###############");
        Student s1 = new Student();
}
class Student {
    int roll_no;
    char name;

    Student() {
        System.out.println("the CONSTRUCTOR is called(NON PARAMETRIZED CONSTRUCTOR)"); //NON PARAMETRIZED CONSTRUCTOR
    }
}

