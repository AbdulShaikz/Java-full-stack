import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int value = input.nextInt();
        int temp = value;
        int reverse = 0;
        while(temp > 0){
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }
        if(value==reverse){
            System.out.println(value + " is a palindrome.");
        }else{
            System.out.println(value + " is a not a palindrome.");
        }
    }
}