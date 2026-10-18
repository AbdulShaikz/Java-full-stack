import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class NonRepeatingCharacter {
	/** Returns the first character that occurs exactly once, or null if none exists. */
	public static Character firstNonRepeatingCharacter(String input) {
		if (input == null || input.isEmpty()) {
			return null;
		}

		Map<Character, Integer> frequencies = new LinkedHashMap<>();
		for (int i = 0; i < input.length(); i++) {
			char character = input.charAt(i);
			frequencies.put(character, frequencies.getOrDefault(character, 0) + 1);
		}

		for (Map.Entry<Character, Integer> entry : frequencies.entrySet()) {
			if (entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		return null;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scanner.nextLine();
		Character result = firstNonRepeatingCharacter(input);
		if (result == null) {
			System.out.println("No non-repeating character found.");
		} else {
			System.out.println("First non-repeating character: " + result);
		}
	}
}

/*
 * Logic: Count each character's occurrences in a LinkedHashMap, which preserves
 * the order in which characters first appear. Then scan that order and return
 * the first character with a count of one. If the input is null, empty, or
 * contains no unique character, return null.
 */
