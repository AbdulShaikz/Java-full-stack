import java.util.Scanner;

public class Anagram{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string 1 : ");
        String s1 = input.nextLine();
        System.out.println("Enter string 2 : ");
        String s2 = input.nextLine();
        input.close();
        
        if(isAnagram(s1, s2)){
            System.out.println("\""+s1+"\" and \""+s2+"\" are anagrams");
        }else{
            System.out.println("\""+s1+"\" and \""+s2+"\" are not anagrams");
        }
    }

    private static boolean isAnagram(String a, String b){
        if(a == null || b == null) return false;
        String s1 = a.replaceAll("\\s+", "").toLowerCase();
        String s2 = b.replaceAll("\\s+", "").toLowerCase();
        if(s1.length() != s2.length()) return false;
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        java.util.Arrays.sort(c1);
        java.util.Arrays.sort(c2);
        return java.util.Arrays.equals(c1, c2);
    }
}