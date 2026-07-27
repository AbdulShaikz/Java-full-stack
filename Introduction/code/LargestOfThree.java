import java.util.Scanner;

public class LargestOfThree{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter three integers separated by spaces: ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        int largest = a;
        if (b > largest) largest = b;
        if (c > largest) largest = c;

        //Using Terinary
        int large = a > b ? (a > c ? a : c) : b;
        System.out.println("Largest value: " + largest);
        System.out.println("Large value using terenary: " + large);
        input.close();
    }
}