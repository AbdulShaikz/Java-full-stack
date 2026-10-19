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
