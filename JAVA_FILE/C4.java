import java.util.Scanner;
    //This program is Written by Piyush Goel
public class C4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the complete name: ");
        String name = sc.nextLine();
        String surname = "";
        int lastSpace = name.lastIndexOf(' ');
        if (lastSpace != -1) {
            surname = name.substring(lastSpace + 1);
        } else {
            surname = name;
        }
        System.out.println("The surname is: " + surname);
    }

}
