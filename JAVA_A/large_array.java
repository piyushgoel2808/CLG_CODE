public class large_array{
    public static int large(int mark[]){
        int ln = Integer.MIN_VALUE;
        for(int i = 0;i<mark.length;i++){
            if (mark[i]>ln) {
                ln=mark[i];
                
            }
        }
        return ln;
    }
    public static void main(String args[]){
        int marks[] = {1,2,3,34,45,787,88,66};
        int a = large(marks);
        System.out.print(a);
    }
}