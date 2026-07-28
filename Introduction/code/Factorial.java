import java.util.Scanner;

public class Factorial{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to find its factorial: ");
        int value = input.nextInt();
        int temp = value;
        int factorial = 1;
        if(value==0 || value==1){
            System.out.println("Factorial of " + value + " is : " + factorial);
        }

        while(temp>0){
            factorial *= temp;
            temp--;
        }
        
        System.out.println("Factorial of " + value + " is : " + factorial);
    }
}