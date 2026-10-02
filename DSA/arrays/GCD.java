public class GCD {
    // Euclidean algorithm to find GCD
    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    // LCM can be computed using: lcm(a, b) = |a * b| / gcd(a, b)
    public static int lcm(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        return Math.abs((a / gcd(a, b)) * b);
    }

    public static void main(String[] args) {
        int num1 = 48;
        int num2 = 18;

        int resultGcd = gcd(num1, num2);
        int resultLcm = lcm(num1, num2);

        System.out.println("GCD of " + num1 + " and " + num2 + " = " + resultGcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " = " + resultLcm);
    }
}

/*
Detailed logic explanation:

1. The gcd(int a, int b) method uses the Euclidean algorithm.
   - Math.abs(a) and Math.abs(b) are used so that negative numbers also work correctly.
   - In the while (b != 0) loop, we calculate the remainder of a divided by b using:
       int temp = a % b;
   - Then we shift values: a = b; b = temp;
   - This continues until b becomes 0.
   - When b becomes 0, the current value of a is the greatest common divisor.

2. The lcm(int a, int b) method calculates the least common multiple using:
      lcm(a, b) = |a * b| / gcd(a, b)
   - If either number is 0, the LCM is 0 because a multiple of zero is undefined in normal arithmetic.
   - We use Math.abs(...) so the result is always positive.

3. In the main() method:
   - num1 = 48 and num2 = 18.
   - gcd(48, 18) computes 6.
   - lcm(48, 18) computes 144.
   - The program prints both values.

Why the Euclidean algorithm works:
- The gcd of two numbers does not change if the larger number is replaced by its remainder when divided by the smaller number.
- Repeating this process reduces the numbers until the remainder becomes 0.
- The last non-zero remainder is the GCD.

Example with 48 and 18:
- 48 % 18 = 12
- 18 % 12 = 6
- 12 % 6 = 0
- So the GCD is 6.
*/
