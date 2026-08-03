import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int size = arr.length;
        for (int pass = 0; pass < size - 1; pass++) {
            boolean swapped = false;
            for (int i = 0; i < size - 1 - pass; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Before sorting:");
        printArray(arr);

        bubbleSort(arr);

        System.out.println("After sorting:");
        printArray(arr);
        scanner.close();
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i < arr.length - 1 ? " " : "\n"));
        }
    }
}