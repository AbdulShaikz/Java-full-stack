import java.util.Scanner;

public class MinMax{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = input.nextInt();
        int arr[] = new int[size];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        System.out.println("Enter "+ size + " elements seperated by spaces: ");
        for(int i=0;i<size;i++){
            arr[i] = input.nextInt();
            min = arr[i] < min ? arr[i] : min;
            max = arr[i] > max ? arr[i] : max;
        }
        System.out.println("Max: "+ max + "\nMin: "+ min);
    }
}