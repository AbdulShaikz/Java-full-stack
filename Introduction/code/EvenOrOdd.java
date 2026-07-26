import java.util.Scanner;

public class EvenOrOdd{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int value = input.nextInt();
        if(value % 2 == 0){
            System.out.println(value+ " is an even number.");
        }else{
            System.out.println(value+ " is an odd number.");
        }       
    }
}