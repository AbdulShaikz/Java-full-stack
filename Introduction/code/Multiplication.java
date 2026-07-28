import java.util.Scanner;

public class Multiplication{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to get its multiplication table : ");
        int value = input.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(value + " x " + i + " = "+ value*i);
        }
    }
}