import java.util.Scanner;

public class StringCompression{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine().trim();

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int charCount = 1;

            while (i + 1 < str.length() && str.charAt(i + 1) == ch) {
                charCount++;
                i++;
            }

            result += ch;
            result += charCount;
        }

        System.out.println("Compressed String: " + result);
        input.close();
    }
}