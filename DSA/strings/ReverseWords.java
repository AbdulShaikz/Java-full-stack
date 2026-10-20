import java.util.Scanner;

public class ReverseWords {
	public static String reverseWords(String sentence) {
		if (sentence == null || sentence.trim().isEmpty()) {
			return "";
		}

		String[] words = sentence.trim().split("\\s+");
		StringBuilder result = new StringBuilder();
		for (int i = words.length - 1; i >= 0; i--) {
			if (result.length() > 0) {
				result.append(' ');
			}
			result.append(new StringBuilder(words[i]).reverse());
		}
		return result.toString();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String sentence = scanner.hasNextLine() ? scanner.nextLine() : "";
		System.out.println(reverseWords(sentence));
		scanner.close();
	}
}

/*
 * Logic in simple terms:
 * 1. If the input is null or contains only whitespace, return an empty string.
 * 2. Remove whitespace from the beginning and end of the sentence, then split
 *    it into words using one or more whitespace characters.
 * 3. Visit the words from last to first so their order is reversed.
 * 4. Reverse each word individually and add it to the result, putting one
 *    space between words.
 * 5. In main, read one line from the user, pass it to reverseWords, print the
 *    result, and close the scanner.
 */
