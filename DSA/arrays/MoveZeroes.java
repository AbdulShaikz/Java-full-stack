public class MoveZeroes {
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int n = scanner.nextInt();
		int[] nums = new int[n];

		for (int i = 0; i < n; i++) {
			nums[i] = scanner.nextInt();
		}

		moveZeroes(nums);

		for (int i = 0; i < nums.length; i++) {
			if (i > 0) {
				System.out.print(" ");
			}
			System.out.print(nums[i]);
		}
		System.out.println();
		scanner.close();
	}

	public static void moveZeroes(int[] nums) {
		int writeIndex = 0;

		for (int num : nums) {
			if (num != 0) {
				nums[writeIndex++] = num;
			}
		}

		while (writeIndex < nums.length) {
			nums[writeIndex++] = 0;
		}
	}
}

/*
 * Explanation:
 * moveZeroes compacts all nonzero values toward the beginning of the array
 * while preserving their original order. writeIndex tracks the next position
 * where a nonzero value should be stored. The enhanced for-loop reads each
 * value, and when it is nonzero, writes it at writeIndex and advances that
 * index. Since writeIndex never moves ahead of the current read position,
 * values that have not yet been examined are not overwritten.
 *
 * After the scan, positions from writeIndex to the end of the array are set
 * to zero. The method modifies the input array in place, uses O(1) extra
 * space, and takes O(n) time. For example, [0, 1, 0, 3, 12] becomes
 * [1, 3, 12, 0, 0].
 */
