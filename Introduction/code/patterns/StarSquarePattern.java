import java.util.Scanner;

public class StarSquarePattern{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a level: ");
        int level = input.nextInt();
        for(int i=0;i<level;i++){
            for(int j=0;j<level;j++){
                if(i==0 || j==0 || i==level-1 || j==level-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}