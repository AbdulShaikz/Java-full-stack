public class MaxSum {
	public static int maxSubarraySum(int[] numbers) {
		if (numbers == null || numbers.length == 0) {
			throw new IllegalArgumentException("Array must not be empty");
		}

		int currentSum = numbers[0];
		int maximumSum = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			currentSum = Math.max(numbers[i], currentSum + numbers[i]);
			maximumSum = Math.max(maximumSum, currentSum);
		}

		return maximumSum;
	}

	public static void main(String[] args) {
		int[] numbers = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		System.out.println("Maximum subarray sum: " + maxSubarraySum(numbers));
	}
}

/*
 * Logic explanation:
 *
 * This method uses Kadane's algorithm to find the maximum sum of any
 * contiguous subarray in linear time.
 *
 * 1. The first element initializes both currentSum and maximumSum. Starting
 *    with the first value ensures that arrays containing only negative
 *    numbers are handled correctly; the result will be the largest negative
 *    number rather than zero.
 *
 * 2. For each remaining element, currentSum represents the largest sum of a
 *    contiguous subarray that ends at the current index. There are two
 *    choices:
 *    - Start a new subarray at the current element.
 *    - Extend the previous subarray by adding the current element.
 *    Math.max(numbers[i], currentSum + numbers[i]) chooses the better option.
 *
 * 3. maximumSum stores the largest subarray sum found anywhere so far. After
 *    calculating currentSum for an index, it is updated if currentSum is
 *    greater than the previously recorded maximum.
 *
 * 4. Because each element is processed exactly once, the time complexity is
 *    O(n), where n is the array length. Only two variables are used apart
 *    from the input array, so the extra space complexity is O(1).
 *
 * Example:
 * For {-2, 1, -3, 4, -1, 2, 1, -5, 4}, the maximum-sum contiguous
 * subarray is {4, -1, 2, 1}, whose sum is 6.
 */
