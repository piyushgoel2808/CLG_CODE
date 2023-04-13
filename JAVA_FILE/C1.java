import java.util.Arrays;
    //This program is Written by Piyush Goel
public class C1 {
    
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("The array is: " + Arrays.toString(arr));

        int min = arr[0]; 
        int max = arr[0]; 

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int diff = max - min;
        System.out.println("The difference between the smallest and largest elements is: " + diff);
    }
}