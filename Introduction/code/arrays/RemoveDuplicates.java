import java.util.Scanner;

public class RemoveDuplicates{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int arr[] = takeInput();
        
        System.out.println("Before removing duplicates: ");
        display(arr);
        System.out.println("After removing duplicates: ");
        removeDuplicate(arr);
    }

    public static int[] takeInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = input.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements seperated by spaces: ");
        for(int i=0;i<size;i++){
            arr[i] = input.nextInt();
        }
        return arr;
    }

    public static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void removeDuplicate(int[] arr){
        for(int i=0;i<arr.length;i++){
            boolean duplicate = false;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    duplicate = true;
                }
            }
            if(duplicate){
                continue;
            }else{
                System.out.print(arr[i]+ " ");
            }
        }
    }
}