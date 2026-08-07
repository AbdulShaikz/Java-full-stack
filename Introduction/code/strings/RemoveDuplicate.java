import java.util.Scanner;

public class RemoveDuplicate{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputStr = input.nextLine();
        char[] inpStr = inputStr.toCharArray();
        for (int i = 0; i < inpStr.length; i++) {
            if (inpStr[i] == '\0' || inpStr[i] == ' ') {
                continue;
            }
            for (int j = i + 1; j < inpStr.length; j++) {
                if (inpStr[j] == inpStr[i]) {
                    inpStr[j] = '\0';
                }
            }
        }

        String result = "";
        for (int i = 0; i < inpStr.length; i++) {
            if (inpStr[i] != '\0') {
                result += inpStr[i];
            }
        }
        System.out.println("String after removing duplicate characters: " + result);
        input.close();
    }
}