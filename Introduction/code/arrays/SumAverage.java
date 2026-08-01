import java.util.Scanner;
public class SumAverage{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = input.nextInt();
        System.out.println("Enter "+ size + " elements seperated by spaces: ");
        int[] arr = new int[size];
        int sum = 0;
        double average = 0;
        for(int i=0;i<size;i++){
            arr[i] = input.nextInt();
            sum += arr[i];
        }
        if (size > 0) {
            average = (double) sum / size;
        }
        System.out.println("Sum of elements: "+ sum + "\nAverage of elements: "+average);
    }
}