import java.util.Scanner;

public class Armstrong{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int value = input.nextInt();
        int temp = value;
        int length = getLength(value);
        int armstrongValue = 0;
        
        while(temp>0){
            int digit = temp%10;
            armstrongValue = armstrongValue + (int) Math.pow(digit, length);
            temp /= 10;
        }

        if(value==armstrongValue){
            System.out.println(value+ " is an armstrong number.");
        }else{
            System.out.println(value+ " is not an armstrong number.");
        }
    }

    public static int getLength(int value){
        int length=0;
        while(value>0){
            length++;
            value /= 10;
        }
        return length;
    }
}