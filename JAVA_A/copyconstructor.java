public class copyconstructor {
    public static void main(String arge[]) {
        System.out.println("This is a program is made by PIYUSH GOEL");
        System.out.println("\n############### COPY CONSTRUCTOR ###############");
        Student s1 = new Student();
        s1.name = "PIYUSH";
        s1.roll_no = 97;
        s1.pass = "abcd";
        Student s2 = new Student(s1);
        s2.pass="xyz";
        System.out.println(s2.name);
        System.out.println(s2.roll_no);
        System.out.println(s2.pass);
        System.out.println(s1.pass);

    }
}

class Student {
    int roll_no;
    String name;
    String pass;
    int marks[]= new ;
    marks[0]= 41;
    marks[1] = 55;
    marks[3]=41;
    marks[4]=99;

    Student(Student s99) {
        this.name = s99.name;
        this.roll_no = s99.roll_no;
        this.pass=s99.pass;
    }

    Student() {
        System.out.println("the CONSTRUCTOR is called(NON PARAMETRIZED CONSTRUCTOR)"); // NON PARAMETRIZED
                                                                                       // CONSTRUCTOR
    }
}
