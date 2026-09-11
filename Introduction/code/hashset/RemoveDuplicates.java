import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int[] numbers = {4, 2, 7, 2, 4, 9, 7, 1};
		Set<Integer> uniqueValues = new HashSet<>();

		for (int number : numbers) {
			uniqueValues.add(number);
		}

		System.out.println(uniqueValues);
	}
}
