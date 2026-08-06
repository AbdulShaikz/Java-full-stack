import java.util.Scanner;

public class MatrixTranspose{
    public static void main(String[] args){
        int[][] matrix = takeInput();
        System.out.println("Before transpose: ");
        display(matrix);
        matrix = matrixTranspose(matrix);
        System.out.println("After transpose: ");
        display(matrix);
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
    public static int[][] matrixTranspose(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length; 
        int[][] transposed = new int[cols][rows];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }
    public static void display(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]);
                if(j!=matrix[0].length-1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}