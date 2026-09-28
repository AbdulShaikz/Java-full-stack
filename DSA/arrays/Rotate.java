
import java.util.Scanner;

public class Rotate{
    public static void main(String[] args){
        System.out.println("Enter the size of the array: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements: ");
        for(int i = 0; i< size;i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the rotations: ");
        int k = scanner.nextInt();

        if (size > 0) {
            k = ((k % size) + size) % size;
            reverse(arr, 0, size - 1);
            reverse(arr, 0, k - 1);
            reverse(arr, k, size - 1);
        }

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + (i < size - 1 ? " " : "\n"));
        }
        scanner.close();
    }

    private static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}