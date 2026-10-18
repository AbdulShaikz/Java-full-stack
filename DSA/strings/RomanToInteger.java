import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {
	private static final Map<Character, Integer> VALUES = Map.of(
			'I', 1, 'V', 5, 'X', 10, 'L', 50,
			'C', 100, 'D', 500, 'M', 1000);

	private static final int[] NUMBERS = {
			1000, 900, 500, 400, 100, 90, 50, 40,
			10, 9, 5, 4, 1
	};
	private static final String[] ROMAN = {
			"M", "CM", "D", "CD", "C", "XC", "L", "XL",
			"X", "IX", "V", "IV", "I"
	};

	public static int romanToInteger(String roman) {
		int total = 0;
		for (int i = 0; i < roman.length(); i++) {
			Integer value = VALUES.get(roman.charAt(i));
			if (value == null) {
				throw new IllegalArgumentException("Invalid Roman numeral");
			}
			if (i + 1 < roman.length() && value < VALUES.get(roman.charAt(i + 1))) {
				total -= value;
			} else {
				total += value;
			}
		}
		return total;
	}

	public static String integerToRoman(int number) {
		if (number < 1 || number > 3999) {
			throw new IllegalArgumentException("Number must be between 1 and 3999");
		}
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < NUMBERS.length; i++) {
			while (number >= NUMBERS[i]) {
				result.append(ROMAN[i]);
				number -= NUMBERS[i];
			}
		}
		return result.toString();
	}

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			if (!scanner.hasNext()) {
				return;
			}
			String input = scanner.next().trim().toUpperCase();
			if (input.matches("\\d+")) {
				int number = Integer.parseInt(input);
				System.out.println(integerToRoman(number));
			} else {
				System.out.println(romanToInteger(input));
			}
		} catch (IllegalArgumentException ex) {
			System.err.println(ex.getMessage());
		}
	}

	// Logic: Roman-to-integer conversion subtracts a symbol when it is smaller
	// than the following symbol; otherwise, it adds it. Integer-to-Roman
	// conversion greedily appends the largest fitting value, including
	// subtractive pairs such as IV and CM, until the number is reduced to zero.
}
