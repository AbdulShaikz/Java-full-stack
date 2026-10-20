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
