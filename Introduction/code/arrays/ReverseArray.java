import java.util.Scanner;

public class ReverseArray{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int arr[];
        int size;
        System.out.println("Enter size of an array: ");
        size = input.nextInt();
        arr = new int[size];
        System.out.println("Enter "+size+" elements separated by space: ");
        for(int i=0;i<size;i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Input Array: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        System.out.println("Reverse Array: ");
        for(int i=size-1;i>=0;i--){
            System.out.print(arr[i] + " ");
        }
    }
}