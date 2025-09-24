import java.util.Scanner;

public class PQ2 {
    private String staffID;
    private String name;
    private String department;
    private String designation;

    public PQ2(String staffID, String name, String department, String designation) {
        this.staffID = staffID;
        this.name = name;
        this.department = department;
        this.designation = designation;
    }

    public void displayDetails() {
        System.out.println("\n--- Staff Details ---");
        System.out.println("Staff ID    : " + staffID);
        System.out.println("Name        : " + name);
        System.out.println("Department  : " + department);
        System.out.println("Designation : " + designation);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of staff to add: ");
        int count = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        PQ2[] staffList = new PQ2[count];

        for (int i = 0; i < count; i++) {
            System.out.println("\nEnter details for Staff " + (i + 1) + ":");

            System.out.print("Enter Staff ID: ");
            String id = scanner.nextLine();

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Department: ");
            String department = scanner.nextLine();

            System.out.print("Enter Designation: ");
            String designation = scanner.nextLine();

            staffList[i] = new PQ2(id, name, department, designation);
        }

        System.out.println("\n=== All Staff Details ===");
        for (PQ2 staff : staffList) {
            staff.displayDetails();
        }

        scanner.close();
    }
}
