public class RotateMatrix {
    public static void rotateMatrix(int[][] matrix) {
        int n = matrix.length;

        // Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Reverse each row to rotate clockwise
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;

            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Original matrix:");
        printMatrix(matrix);

        rotateMatrix(matrix);

        System.out.println("\nRotated matrix (90° clockwise):");
        printMatrix(matrix);
    }
}

/*
 * Explanation:
 *
 * A 90-degree clockwise rotation can be performed in two steps without using
 * another matrix:
 *
 * 1. Transpose the matrix:
 *    Swap matrix[i][j] with matrix[j][i]. This changes rows into columns.
 *    Only elements above the main diagonal are swapped so that each pair is
 *    exchanged exactly once.
 *
 * 2. Reverse every row:
 *    After transposing, reversing each row places the columns in the order
 *    required for a clockwise rotation.
 *
 * For example:
 *     1 2 3        1 4 7        7 4 1
 *     4 5 6   ->   2 5 8   ->   8 5 2
 *     7 8 9        3 6 9        9 6 3
 *
 * The algorithm modifies the matrix in place, so it uses O(1) extra space.
 * Each element is processed a constant number of times, giving O(n^2) time
 * complexity for an n x n matrix.
 */
