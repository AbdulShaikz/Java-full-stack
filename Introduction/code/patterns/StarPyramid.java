import java.util.Scanner;

public class StarPyramid{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of levels: ");
        int value = input.nextInt();
        for(int i=0; i<value; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        input.close();
    }
}