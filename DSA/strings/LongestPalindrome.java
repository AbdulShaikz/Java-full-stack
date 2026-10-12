public class LongestPalindrome {
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }

        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            int oddLen = expandAroundCenter(s, i, i);
            int evenLen = expandAroundCenter(s, i, i + 1);
            int maxLen = Math.max(oddLen, evenLen);

            if (maxLen > end - start + 1) {
                start = i - (maxLen - 1) / 2;
                end = i + maxLen / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
        System.out.println(longestPalindrome("cbbd"));
        System.out.println(longestPalindrome("racecar"));
        System.out.println(longestPalindrome("a"));
    }
}

/*
 * Explanation of the longest palindrome algorithm:
 *
 * This program uses the "expand around the center" technique.
 * The idea is: every palindrome has a center, and we can expand
 * outward from that center to find the longest palindrome.
 *
 * For each index i in the string:
 * 1. We check for an odd-length palindrome centered at i.
 *    Example: "aba" -> center is 'b'.
 * 2. We also check for an even-length palindrome centered between i and i+1.
 *    Example: "abba" -> center is between the two 'b's.
 *
 * The method expandAroundCenter(left, right) keeps moving left and right
 * outward while the characters match. Every time a match is found, it grows
 * the palindrome length by 2 or by 1 depending on the odd/even case.
 *
 * We compare each found palindrome length with the currently best length.
 * If a longer palindrome is found, we store its start and end positions.
 * At the end, we return the substring from start to end.
 *
 * Example:
 * Input: "babad"
 * The longest palindrome is "bab" or "aba".
 * The program checks all possible centers and picks the longest valid one.
 *
 * Time complexity: O(n^2)
 * Space complexity: O(1)
 *
 * Why this works:
 * - A palindrome is fully determined by its center.
 * - At each center, the longest palindrome can be found by expanding outward.
 * - Trying every possible center ensures that no valid palindrome is missed.
 */
