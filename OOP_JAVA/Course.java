import java.util.ArrayList;

public class Course {
    private ArrayList<String> courseList;

    public Course() {
        courseList = new ArrayList<>();
        courseList.add("Computer Science");
        courseList.add("Mechanical Engineering");
        courseList.add("Electrical Engineering");
        courseList.add("Business Administration");
        courseList.add("Psychology");
        courseList.add("Biotechnology");
    }

    public void displayCourses() {
        System.out.println("Available Courses in the University:");
        for (int i = 0; i < courseList.size(); i++) {
            System.out.println((i + 1) + ". " + courseList.get(i));
        }
    }

    // Main method
    public static void main(String[] args) {
        Course universityCourses = new Course();
        universityCourses.displayCourses();
    }
}
