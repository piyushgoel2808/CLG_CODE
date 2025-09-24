import java.util.Arrays;

public class Matrix {

    public static void main(String[] args) {
        // Declare and initialize two matrices of 2x2 size
        int[][] mat1 = {{1, 2}, {3, 4}};
        int[][] mat2 = {{5, 6}, {7, 8}};

        // Print the matrices
        System.out.println("The first matrix is: ");
        printMatrix(mat1);
        System.out.println("The second matrix is: ");
        printMatrix(mat2);

        // Declare and initialize two matrices to store the results of addition and multiplication
        int[][] add = new int[2][2];
        int[][] mul = new int[2][2];

        // Loop through the matrices to perform the operations
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                // Add the corresponding elements of mat1 and mat2 and store in add
                add[i][j] = mat1[i][j] + mat2[i][j];
                // Initialize the element of mul to zero
                mul[i][j] = 0;
                // Loop through the row of mat1 and column of mat2 to calculate the element of mul
                for (int k = 0; k < 2; k++) {
                    mul[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        // Print the results
        System.out.println("The addition of the matrices is: ");
        printMatrix(add);
        System.out.println("The multiplication of the matrices is: ");
        printMatrix(mul);
    }

    // A helper method to print a matrix
    public static void printMatrix(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            System.out.println(Arrays.toString(mat[i]));
        }
    }
}