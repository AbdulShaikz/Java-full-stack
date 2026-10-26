import java.util.Scanner;

public class Cipher {
	public static String encrypt(String text, int key) {
		return shift(text, key);
	}

	public static String decrypt(String text, int key) {
		return shift(text, -key);
	}

	private static String shift(String text, int key) {
		int normalizedKey = Math.floorMod(key, 26);
		StringBuilder result = new StringBuilder(text.length());

		for (char character : text.toCharArray()) {
			if (character >= 'A' && character <= 'Z') {
				result.append((char) ('A' + (character - 'A' + normalizedKey) % 26));
			} else if (character >= 'a' && character <= 'z') {
				result.append((char) ('a' + (character - 'a' + normalizedKey) % 26));
			} else {
				result.append(character);
			}
		}

		return result.toString();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter text: ");
		String text = scanner.nextLine();
		System.out.print("Enter shift key: ");
		int key = scanner.nextInt();

		String encrypted = encrypt(text, key);
		System.out.println("Encrypted: " + encrypted);
		System.out.println("Decrypted: " + decrypt(encrypted, key));
		scanner.close();
	}
}
