import java.util.Scanner;

public class BinarySearch{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = input.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter "+size+" elements in sorted order separated by spaces: ");
        for(int i=0;i<size;i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Enter an element to search: ");
        int element = input.nextInt();
        int searchIndex = binarySearch(arr, element);
        if(searchIndex != -1){
            System.out.println(element+ " is at index "+searchIndex);
        }else{
            System.out.println("Element not found");
        }
    }
    
    public static int binarySearch(int arr[], int element){
        int left = 0, right = arr.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == element){
                return mid;
            }else if(arr[mid] < element){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return -1;
    }
}

