import java.util.Scanner;

public class ReverseString{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();
        char[] reverseStr = str.toCharArray();
        for(int i=0;i<reverseStr.length/2;i++){
            char temp = reverseStr[i];
            reverseStr[i] = reverseStr[reverseStr.length-1-i];
            reverseStr[reverseStr.length-1-i] = temp;
        }
        System.out.println("Reverse String is: " + new String(reverseStr));
    }
}