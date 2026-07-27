import java.util.Scanner;

public class PrimeNumber{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int value = input.nextInt();
        // Simple O(n) solution
        boolean primeSimple = isPrimeSimple(value);
        System.out.println("[Simple] " + value + (primeSimple ? " is a prime number." : " is not a prime number."));

        // Optimized O(sqrt(n)) solution
        boolean primeOptimized = isPrimeOptimized(value);
        System.out.println("[Optimized] " + value + (primeOptimized ? " is a prime number." : " is not a prime number."));
    }

    // simple check: count divisors (O(n))
    private static boolean isPrimeSimple(int value) {
        if (value <= 1) return false;
        int factors = 0;
        for (int i = 1; i <= value; i++) {
            if (value % i == 0) factors++;
        }
        return factors == 2;
    }

    // optimized check using trial division up to sqrt(n) (O(sqrt(n)))
    private static boolean isPrimeOptimized(int value) {
        if (value <= 1) return false;
        if (value <= 3) return true;
        if (value % 2 == 0) return value == 2;
        int limit = (int)Math.sqrt(value);
        for (int i = 3; i <= limit; i += 2) {
            if (value % i == 0) return false;
        }
        return true;
    }
}