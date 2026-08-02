import java.util.Scanner;

public class InplaceReverse{
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
        for(int i=0;i<size/2;i++){
            int temp = arr[i];
            arr[i] = arr[size-1-i];
            arr[size-1-i]=temp;
        }
        System.out.println();
        System.out.println("Reversed Array: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i] + " ");
        }
    }
}