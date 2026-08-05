import java.util.Scanner;

public class MatrixSum{
    public static void main(String[] args){
        int[][] matrix = takeInput();
        int[] diagonals = matrixSum(matrix);
        System.out.println("Left diagonal sum: " + diagonals[0]);
        System.out.println("Right diagonal sum: " + diagonals[1]);
    }
    public static int[][] takeInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = input.nextInt();
        System.out.println("Enter number of columns: ");
        int cols = input.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements in matrix order: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j] = input.nextInt();
            }
        }
        return matrix;
    }
    public static int[] matrixSum(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;

        // row sums
        for(int i=0;i<rows;i++){
            int rSum = 0;
            for(int j=0;j<cols;j++){
                rSum += matrix[i][j];
            }
            System.out.println("Sum of row " + i + ": " + rSum);
        }

        // column sums
        for(int j=0;j<cols;j++){
            int cSum = 0;
            for(int i=0;i<rows;i++){
                cSum += matrix[i][j];
            }
            System.out.println("Sum of column " + j + ": " + cSum);
        }
        
        int leftDiagonalSum = 0;
        int rightDiagonalSum = 0;

        if (rows != cols) {
            System.out.println("Warning: Diagonals are only defined for square matrices. Skipping diagonal calculation.");
            return new int[]{0, 0}; 
        }

        //for square matrix
        for(int i=0;i<rows;i++){
            leftDiagonalSum += matrix[i][i];
            rightDiagonalSum += matrix[i][rows - 1 - i];
        }

        return new int[]{leftDiagonalSum, rightDiagonalSum};
    }
}