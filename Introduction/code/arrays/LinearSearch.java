import java.util.Scanner;

public class LinearSearch{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = input.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter "+size+" elements separated by spaces: ");
        for(int i=0;i<size;i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Enter an element to search: ");
        int element = input.nextInt();
        int searchIndex = -1;
        for(int i=0;i<size;i++){
            if(arr[i]==element){
                searchIndex = i;
                System.out.println(arr[i]+ " is at index "+i);
                break;
            }
        }
        if(searchIndex==-1){
            System.out.println("Element not found");
        }
    }
}