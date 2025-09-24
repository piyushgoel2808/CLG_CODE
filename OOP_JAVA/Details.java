public class Details {
    public static void main(String[] args) {
        System.out.println("Hello!Enter your Details");
        String name = "Piyush Goel\n";
        String course = "MCA\n";
        Details dat = new Details(1, name, course);
        dat.Student();
    }

    public int id;
    public String name;
    public String course;

    Details(int id, String name, String Course) {
        this.id = id;
        this.name = name;
        this.course = Course;
    }

    public void Student() {
        System.out.print("Student Name : " + name);
        System.out.println("Student ID   : " + id);
        System.out.println("Course       : " + course);
    }
}
