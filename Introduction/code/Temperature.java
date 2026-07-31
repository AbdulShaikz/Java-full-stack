import java.util.Scanner;

public class Temperature{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a temp: ");
        double temp = input.nextDouble();
        System.out.println("Select the below options:\n1.C -> F\n2.F -> C");
        int option = input.nextInt();
        switch(option){
            case 1:
                System.out.println(((temp * 1.8) + 32) + " F");
                break;
            case 2:
                System.out.println(((temp - 32) / 1.8) + " C");
                break;
            default:
                System.out.println("Select a valid option");
        }
    }
}