import java.util.Scanner;

public class PalindromeString{
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
        String reversed = new String(reverseStr);
        if(str.trim().toLowerCase().equals(reversed.trim().toLowerCase())){
            System.out.println(str+ " is a palindrome string.");
        }else{
            System.out.println(str+ " is not a palindrome string.");
        }
    }
}