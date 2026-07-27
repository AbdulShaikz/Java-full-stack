import java.util.Scanner;

public class ReverseNumber{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer to reverse it: ");
        int value = input.nextInt();
        int temp = value;
        int reverse = 0;
        while(temp>0){
            int digit = temp%10;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }
        System.out.println("The reverse of " + value+ " is : " + reverse);
    }
}