public class constructor {
    public static void main(String arge[]){
        System.out.println("This is a program is made by PIYUSH GOEL");
        System.out.println("\n############### NON PARAMETRIZED CONSTRUCTOR ###############");
        Student s1 = new Student();
        System.out.println("\n################# PARAMETRIZED CONSTRUCTOR ################");
        //CONSTRUCTER OVERLOADING(same name diff args)
        // Teacher t1 = new Teacher();  ////IF A CONSTUCOR IS MADE IT java doesnot make a defalt constructer (with no argumet)
        Teacher t1 = new Teacher(584);
        Teacher t2 = new Teacher("Piyush");
    }
}

class Student {
    int roll_no;
    char name;

    Student() {
        System.out.println("the CONSTRUCTOR is called(NON PARAMETRIZED CONSTRUCTOR)"); //NON PARAMETRIZED CONSTRUCTOR
    }
}
class Teacher {
    int A_no;
    String name;
//WE CAN HAVE MORE THAM ONE CONSTRUCTER ALSO 

    Teacher(String name) {
        this.name = name;
        System.out.println("the CONSTRUCTOR is called(PARAMETRIZED CONSTRUCTOR):- " + name); // PARAMETRIZED CONSTRUCTOR

    }
    Teacher(int A_no) {
        this.A_no = A_no;
        System.out.println("the CONSTRUCTOR is called(PARAMETRIZED CONSTRUCTOR):- "+A_no); //NON PARAMETRIZED CONSTRUCTOR
    }
}