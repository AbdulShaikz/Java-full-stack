import java.util.Scanner;

public class NumberToWords {
    private static final String[] ones = {
            "zero", "one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine"
    };

    private static final String[] teens = {
            "ten", "eleven", "twelve", "thirteen", "fourteen",
            "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };

    private static final String[] tens = {
            "", "", "twenty", "thirty", "forty",
            "fifty", "sixty", "seventy", "eighty", "ninety"
    };

    public static String numberToWords(long number) {
        if (number < 0) {
            return "minus " + numberToWords(Math.abs(number));
        }
        if (number == 0) {
            return "zero";
        }

        StringBuilder result = new StringBuilder();

        if (number >= 1_000_000_000_000L) {
            long trillion = number / 1_000_000_000_000L;
            result.append(numberToWords(trillion)).append(" trillion ");
            number %= 1_000_000_000_000L;
        }

        if (number >= 1_000_000_000L) {
            long billion = number / 1_000_000_000L;
            result.append(numberToWords(billion)).append(" billion ");
            number %= 1_000_000_000L;
        }

        if (number >= 1_000_000L) {
            long million = number / 1_000_000L;
            result.append(numberToWords(million)).append(" million ");
            number %= 1_000_000L;
        }

        if (number >= 1_000L) {
            long thousand = number / 1_000L;
            result.append(numberToWords(thousand)).append(" thousand ");
            number %= 1_000L;
        }

        if (number >= 100L) {
            long hundred = number / 100L;
            result.append(ones[(int) hundred]).append(" hundred ");
            number %= 100L;
        }

        if (number >= 20L) {
            long tensValue = number / 10L;
            result.append(tens[(int) tensValue]);
            long onesValue = number % 10L;
            if (onesValue > 0) {
                result.append("-").append(ones[(int) onesValue]);
            }
        } else if (number >= 10L) {
            result.append(teens[(int) number - 10]);
        } else if (number > 0L) {
            result.append(ones[(int) number]);
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        String words = numberToWords(number);
        System.out.println(words);

        scanner.close();
    }
}
