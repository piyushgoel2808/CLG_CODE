public class B1 {
  //This program is Written by Piyush Goel
    public static void main(String[] args) {
        int[] arr = new int[args.length];
        for (int i = 0; i < args.length; i++) {
          arr[i] = Integer.parseInt(args[i]);
        }
        System.out.println("Elements of array are:");
        for (int i = 0; i < arr.length; i++) {
          System.out.println(arr[i]);
        }
      }  
}

