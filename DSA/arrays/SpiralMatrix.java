import java.util.Scanner;

public class SpiralMatrix {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		if (!scanner.hasNextInt()) {
			return;
		}

		int rows = scanner.nextInt();
		int columns = scanner.nextInt();
		int[][] matrix = new int[rows][columns];

		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				matrix[row][column] = scanner.nextInt();
			}
		}

		StringBuilder result = new StringBuilder();
		int top = 0;
		int bottom = rows - 1;
		int left = 0;
		int right = columns - 1;

		while (top <= bottom && left <= right) {
			for (int column = left; column <= right; column++) {
				append(result, matrix[top][column]);
			}
			top++;

			for (int row = top; row <= bottom; row++) {
				append(result, matrix[row][right]);
			}
			right--;

			if (top <= bottom) {
				for (int column = right; column >= left; column--) {
					append(result, matrix[bottom][column]);
				}
				bottom--;
			}

			if (left <= right) {
				for (int row = bottom; row >= top; row--) {
					append(result, matrix[row][left]);
				}
				left++;
			}
		}

		System.out.println(result);
	}

	private static void append(StringBuilder result, int value) {
		if (result.length() > 0) {
			result.append(' ');
		}
		result.append(value);
	}
}

/*
 * Detailed explanation:
 *
 * The matrix is traversed layer by layer, starting at the outside and moving
 * toward the center. Four boundaries describe the unvisited part of the
 * matrix:
 *\n+ * - top: the first unvisited row
 * - bottom: the last unvisited row
 * - left: the first unvisited column
 * - right: the last unvisited column
 *
 * For each layer, the algorithm visits four sides in order:
 * 1. Traverse the top row from left to right, then move top downward.
 * 2. Traverse the right column from top to bottom, then move right leftward.
 * 3. If rows remain, traverse the bottom row from right to left, then move
 *    bottom upward.
 * 4. If columns remain, traverse the left column from bottom to top, then move
 *    left rightward.
 *
 * The boundary checks before steps 3 and 4 prevent values from being printed
 * twice when the matrix has only one remaining row or column. The loop ends
 * when the boundaries cross, meaning every element has been visited.
 *
 * The append method adds spaces only between values, so the output contains no
 * extra space at the beginning or end. Each matrix element is processed once,
 * giving O(rows * columns) time complexity. The boundary variables and the
 * output builder use O(1) auxiliary space, excluding the output itself.
 */
