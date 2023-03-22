public class rev {
    public static void rev1(int mark[]){
        int first = 0 ; int last = mark.length -1;
        while (first<last) {
            int temp = mark[first];
            mark[first] = mark[last] ;
            mark[last] = temp;

            first ++;
            last--;
        }

    }
    
 java.util.
    public static void main(String[] args){
        int marks[] = { 1,2,5,9,4};
        rev1(marks);
        // System.out.print(marks[]);
        for(int i = 0 ; i <marks.length;i++){
            System.out.print(marks[i]);
        }
    }
}
