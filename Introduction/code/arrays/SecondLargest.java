import java.util.Scanner;
public class SecondLargest{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = input.nextInt();
        System.out.println("Enter "+ size + " elements seperated by spaces: ");
        int[] arr = new int[size];
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i=0;i<size;i++){
            arr[i] = input.nextInt();
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }
        System.out.println("Second largest element in the array is: "+ secondLargest);
    }
}