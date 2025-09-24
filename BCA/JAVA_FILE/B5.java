import java.util.Arrays;
import java.util.Scanner;
public class B5 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 7, 1};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element you want to search:");
        int key = sc.nextInt();
        int index = Arrays.binarySearch(arr, key);
        if (index < 0) {
          System.out.println("Element not found in the array.");
        } else {
          System.out.println("Element found at index " + index);
        }
      }
}
