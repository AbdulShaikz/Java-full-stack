import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxElement {
	public static <T extends Comparable<T>> T findMax(List<T> list) {
		if (list == null || list.isEmpty()) {
			throw new IllegalArgumentException("List must not be null or empty");
		}

		T max = list.get(0);
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i).compareTo(max) > 0) {
				max = list.get(i);
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int maxNumber = findMax(Arrays.asList(3, 1, 5, 2));
		System.out.println("Maximum number: " + maxNumber);
		if (maxNumber != 5) {
			throw new AssertionError("Failed to find the maximum element");
		}
		String maxString = findMax(Arrays.asList("apple", "zebra", "pear"));
		System.out.println("Maximum string: " + maxString);
		if (!maxString.equals("zebra")) {
			throw new AssertionError("Failed to find the maximum string");
		}
		try {
			findMax(Collections.<Integer>emptyList());
			throw new AssertionError("Expected an exception for an empty list");
		} catch (IllegalArgumentException expected) {
			// Expected.
		}
	}
}

// Learning points:
// - Generics let findMax work with different comparable types while preserving type safety.
// - The bound <T extends Comparable<T>> requires elements to define their natural ordering.
// - Validate null or empty input before accessing the first element.
// - compareTo() returns a positive value when the current element is greater than max.
