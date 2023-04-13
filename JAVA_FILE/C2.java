import java.util.*;
    //This program is Written by Piyush Goel
public class C2 {

    public static void main(String[] args) {

        int[][] mat1 = { { 1, 2 }, { 3, 4 } };
        int[][] mat2 = { { 5, 6 }, { 7, 8 } };

        // Print the matrices
        System.out.println("The first matrix is: ");
        printMatrix(mat1);
        System.out.println("The second matrix is: ");
        printMatrix(mat2);

        int[][] add = new int[2][2];
        int[][] mul = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {

                add[i][j] = mat1[i][j] + mat2[i][j];
                mul[i][j] = 0;

                for (int k = 0; k < 2; k++) {
                    mul[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        System.out.println("The addition of the matrices is: ");
        printMatrix(add);
        System.out.println("The multiplication of the matrices is: ");
        printMatrix(mul);
    }

    public static void printMatrix(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            System.out.println(Arrays.toString(mat[i]));
        }
    }

}
