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

/*
Logic Explanation (Detailed):

1. Base Conditions
   - If the input number is less than 0, the method converts it to a positive value using Math.abs(number)
     and adds the word "minus" before the result.
   - If the input number is 0, it directly returns "zero".
   - These conditions stop the recursive calls before the program tries to process invalid values.

2. Use of Arrays for Word Mapping
   - The arrays ones, teens, and tens store the words for numbers from 0 to 99.
   - ones[0..9] = {zero, one, two, ..., nine}
   - teens[0..9] = {ten, eleven, twelve, ..., nineteen}
   - tens[0..9] = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"}
   - These arrays are used repeatedly to convert digits and tens values into words.

3. Breaking the Number into Large Groups
   - The method checks the number in descending scale order:
     - trillion
     - billion
     - million
     - thousand
     - hundred
   - If the number is greater than or equal to a scale value, it divides by that scale to get the group value.
   - Example: if number = 1_234_567, then thousand = 1_234 and the code appends "one thousand".

4. Recursive Conversion of Each Group
   - After extracting a large group, it calls numberToWords() again on that group.
   - Example: number = 2_345_678
     - million part = 2
     - result adds: "two million"
     - remaining = 345_678
   - This recursive approach keeps the code clean and handles all large values systematically.

5. Handling Hundreds
   - If the number is at least 100, the program calculates:
     - hundred = number / 100
     - then appends ones[hundred] + " hundred"
   - Example: 500 -> "five hundred"
   - Then it takes the remainder after dividing by 100 for the leftover part.

6. Handling Tens and Ones
   - If the remaining number is at least 20:
     - tensValue = number / 10
     - result adds tens[tensValue]
     - onesValue = number % 10
     - if there is a remainder, it appends a hyphen and the ones word.
   - Example: 47 -> "forty-seven"
   - If the remaining number is between 10 and 19:
     - it directly reads from the teens array.
   - Example: 15 -> "fifteen"
   - If the remaining number is between 1 and 9:
     - it directly reads from the ones array.
   - Example: 8 -> "eight"

7. Why the Method Works
   - The program repeatedly reduces the value into smaller subgroups.
   - Each group is converted using the same logic until only 0 to 99 remains.
   - This is a classic recursive decomposition approach, where large values are broken down into manageable pieces.

8. Example Walkthrough
   - Input: 1_234_567
   - million = 1 -> "one million"
   - remainder = 234_567
   - thousand = 234 -> "two hundred thirty-four thousand"
   - remainder = 567
   - hundred = 5 -> "five hundred"
   - remainder = 67
   - tens = 60 -> "sixty-seven"
   - Final output: "one million two hundred thirty-four thousand five hundred sixty-seven"

9. Importance of trim()
   - At the end, the result is converted into a StringBuilder and then trimmed.
   - This removes unnecessary spaces before or after the final sentence, keeping the output clean.

This program demonstrates recursion, array-based mapping, and number decomposition in a simple and efficient way.
*/
