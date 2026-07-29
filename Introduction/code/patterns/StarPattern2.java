import java.util.Scanner;

public class StarPattern2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a level: ");
        int level = input.nextInt();
        for(int i = 0; i < level; i++){
            for(int j = 0; j < level - i - 1; j++){
                System.out.print(" ");
            }
            for(int k = 0; k <= i; k++){
                System.out.print("*");
                if(k < i){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}