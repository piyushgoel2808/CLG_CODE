import java.util.Arrays;

public class B3 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 7, 1};
        Arrays.sort(arr);
        System.out.println("Elements of array sorted in ascending order:");
        for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Elements of array sorted in descending order:");
        for (int i = arr.length - 1; i >= 0; i--) {
          System.out.print(arr[i] + " ");
        }
      }
}
