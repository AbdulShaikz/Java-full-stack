public class MissingNumber {

	public static int findUsingSum(int[] numbers) {
		int n = numbers.length + 1;
		long expectedSum = (long) n * (n + 1) / 2;
		long actualSum = 0;

		for (int number : numbers) {
			actualSum += number;
		}

		return (int) (expectedSum - actualSum);
	}

	public static int findUsingXor(int[] numbers) {
		int n = numbers.length + 1;
		int missing = n;

		for (int i = 0; i < numbers.length; i++) {
			missing ^= (i + 1) ^ numbers[i];
		}

		return missing;
	}

	public static void main(String[] args) {
		int[] numbers = {1, 2, 4, 5, 3};
		System.out.println(findUsingSum(numbers));
		System.out.println(findUsingXor(numbers));
	}
}

// Logic:
// The array should contain every integer from 1 through n exactly once, but
// one integer is missing. Because the array contains n - 1 values, n is the
// array length plus one.
//
// findUsingSum() uses the arithmetic-series formula to calculate the sum of
// the complete range. It subtracts the array's actual sum, and all present
// values cancel out, leaving the missing number. It uses O(n) time and O(1)
// extra space.
//
// findUsingXor() XORs all expected values with all values in the array. XOR
// cancels equal values (x ^ x = 0), while 0 ^ x = x, so only the missing value
// remains. It also uses O(n) time and O(1) extra space and avoids sum overflow.
