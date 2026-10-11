import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestSubString {
	/** Returns the length of the longest substring with no repeated characters. */
	public static int lengthOfLongestSubstring(String text) {
		Map<Character, Integer> lastSeen = new HashMap<>();
		int windowStart = 0;
		int maxLength = 0;

		for (int windowEnd = 0; windowEnd < text.length(); windowEnd++) {
			char current = text.charAt(windowEnd);
			Integer previousIndex = lastSeen.get(current);
			if (previousIndex != null && previousIndex >= windowStart) {
				windowStart = previousIndex + 1;
			}

			lastSeen.put(current, windowEnd);
			maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
		}

		return maxLength;
	}

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String input = scanner.hasNextLine() ? scanner.nextLine() : "";
			System.out.println(lengthOfLongestSubstring(input));
		}
	}

	/*
	 * Simple explanation of the logic:
	 *
	 * We scan the string from left to right using a moving window.
	 * The variable windowStart marks the beginning of the current valid window,
	 * and windowEnd is the current position we are checking.
	 *
	 * We store the last index of every character in a map called lastSeen.
	 * For each character, we ask: "Have I seen this character before in the
	 * current window?" If yes, then the character repeats. In that case, we move
	 * windowStart to one position after the previous occurrence so the window no
	 * longer contains duplicates.
	 *
	 * Example: in "abba", when we reach the second 'b', we see that 'b' was
	 * already used earlier in the current window. So we shrink the window from the
	 * previous 'b' position + 1. This keeps only unique characters in the window.
	 *
	 * After fixing the window, we update the last seen position of the current
	 * character and calculate the length of the current window as:
	 * windowEnd - windowStart + 1.
	 *
	 * maxLength stores the largest valid window length found so far. At the end,
	 * it gives the length of the longest substring without repeated characters.
	 *
	 * This is called the sliding window technique because the window moves only
	 * forward, never backward. It is efficient because each character is processed
	 * once, so the time complexity is O(n), where n is the length of the string.
	 */
}
