import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Primes {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine().trim());

        if (n < 2) {
            System.out.println();
            return;
        }

        boolean[] composite = new boolean[n + 1];
        StringBuilder result = new StringBuilder();

        for (int number = 2; number <= n; number++) {
            if (!composite[number]) {
                if (result.length() > 0) {
                    result.append(' ');
                }
                result.append(number);

                if ((long) number * number <= n) {
                    for (int multiple = number * number; multiple <= n; multiple += number) {
                        composite[multiple] = true;
                    }
                }
            }
        }

        System.out.println(result);
    }
}

/*
 Explanation in simple words:

 1. The program first reads a number n from the user.
    Example: if n is 20, it wants all prime numbers from 2 to 20.

 2. We create a boolean array named composite with size n + 1.
    This array is used to mark numbers that are not prime.
    Initially, all values are false because no number is marked yet.

 3. We start a loop from number = 2 to n.
    If a number is not marked as composite, then it is a prime number.
    We add that number to the result string.

 4. For every prime number, we mark its multiples as composite.
    Example: if number = 2, then 4, 6, 8, 10, ... are marked.
    If number = 3, then 9, 15, 21, ... are marked.

 5. We do this only when (long) number * number <= n.
    This is important because if a number's square is greater than n,
    then its multiples are already beyond the range we need to check.

 6. The condition if (!composite[number]) ensures we only process numbers
    that are not already marked as non-prime.

 7. The program builds the answer in a StringBuilder and prints it at the end.
    This is efficient because we are adding numbers without making many
    new strings in memory.

 8. This method is called the Sieve of Eratosthenes.
    It is a smart way to find all prime numbers up to a limit quickly.

 Example:
 Input: 20
 Output: 2 3 5 7 11 13 17 19

 Why it works:
 - A prime number has no divisors other than 1 and itself.
 - If a number is a multiple of any smaller prime, then it cannot be prime.
 - So once we mark multiples of each prime, all non-prime numbers are removed.

 This is why the program is fast and works well for large values of n.
*/
