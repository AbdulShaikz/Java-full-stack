import java.util.Scanner;

public class TwoSum{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int arr[] = takeInput();
        
        System.out.println("Enter the target sum: ");
        int targetSum = input.nextInt();
        
        int ans[] = findTwoSum(arr,targetSum);
        if(ans.length==2){
            System.out.println("The two elements from the array which sumup to "+targetSum+" are: ");
            display(ans);
        }else{
            System.out.println("No such elements resulting the targetSum");
        }
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

    public static int[] findTwoSum(int[] arr, int targetSum){
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] + arr[j] == targetSum){
                    return new int[] {arr[i], arr[j]};
                }
            }
        }
        return new int[0];
    }
}