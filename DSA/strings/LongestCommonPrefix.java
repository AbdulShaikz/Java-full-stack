import java.util.Scanner;

public class LongestCommonPrefix {
	public static String findLongestCommonPrefix(String[] strings) {
		if (strings == null || strings.length == 0) {
			return "";
		}

		String prefix = strings[0];
		for (int i = 1; i < strings.length; i++) {
			while (!strings[i].startsWith(prefix)) {
				prefix = prefix.substring(0, prefix.length() - 1);
				if (prefix.isEmpty()) {
					return "";
				}
			}
		}
		return prefix;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		String[] strings = new String[count];
		for (int i = 0; i < count; i++) {
			strings[i] = scanner.next();
		}

		System.out.println(findLongestCommonPrefix(strings));
		scanner.close();
	}
}

/*
 * Logic:
 * 1. If the array is null or has no strings, there is no common prefix, so
 *    return an empty string.
 * 2. Start with the first string as the candidate prefix.
 * 3. Check each remaining string. If it does not start with the candidate,
 *    remove the candidate's last character and check again. Repeating this
 *    keeps shortening the candidate until it matches the start of that string.
 * 4. If the candidate becomes empty, the strings have no non-empty common
 *    prefix, so return an empty string. Otherwise, after all strings are
 *    checked, the candidate is the longest prefix shared by every string.
 * 5. In main, read the number of strings and the strings themselves, call the
 *    method, and print its result.
 */
