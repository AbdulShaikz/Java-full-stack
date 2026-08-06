import java.util.Scanner;

public class CharacterFrequency{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();
        int[] frequency = new int[256];
        for(int i=0;i<str.length();i++){
            char alphabet = str.charAt(i);
            frequency[alphabet]++;
        }

        System.out.println("Frequency count: ");
        for(int i=0;i<256;i++){
            if(frequency[i]>0){
                char ch = (char) i;
                // skip non-printable characters except space
                if(!Character.isISOControl(ch) || ch==' ') {
                    System.out.println(ch + ": " + frequency[i]);
                }
            }
        }
        input.close();
    }
}