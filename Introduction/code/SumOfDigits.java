import java.util.Scanner;

public class SumOfDigits{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int value;
        System.out.println("Enter an integer to sum its digits: ");
        value = input.nextInt();
        while(value>0){
            int digit = value%10;
            sum += digit;
            value /= 10;
        }
        System.out.println("The sum of digits is: " + sum);
        input.close();
    }
}