import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int[] numbers = new int[n];
		for (int i = 0; i < n; i++) {
			numbers[i] = scanner.nextInt();
		}
		int target = scanner.nextInt();

		Map<Integer, Integer> seen = new HashMap<>();

		for (int i = 0; i < n; i++) {
			int complement = target - numbers[i];

			if (seen.containsKey(complement)) {
				System.out.println("Indices: " + seen.get(complement) + ", " + i);
				System.out.println("Values: " + complement + ", " + numbers[i]);
				scanner.close();
				return;
			}

			// Insert after checking so one element is not used twice.
			seen.put(numbers[i], i);
		}

		System.out.println("No pair found");
		scanner.close();
	}
}

/*
 * Learning points:
 * 1. A HashMap provides average O(1) lookup for the needed complement.
 * 2. Check target - current number before storing the current number.
 * 3. The complete solution runs in O(n) time and uses O(n) extra space.
 */
