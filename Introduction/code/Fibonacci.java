import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n;
        try {
            n = Integer.parseInt(sc.nextLine().trim());
        } catch (Exception e) {
            System.out.println("Invalid input");
            sc.close();
            return;
        }

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            sc.close();
            return;
        }

        System.out.println("Fibonacci series up to " + n + " terms:");
        long a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a);
            if (i < n) System.out.print(" ");
            long next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
        sc.close();
    }
}
