
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

/*
Explanation of the rotation logic:

1. We want to rotate the array by k positions to the right.
   Example: [1, 2, 3, 4, 5] rotated by 2 -> [4, 5, 1, 2, 3]

2. The code first normalizes k to a valid index using:
      k = ((k % size) + size) % size;
   This ensures that if k is larger than the size of the array, or negative,
   it still represents a valid rotation within the array bounds.
   Example: size = 5, k = 7 => 7 % 5 = 2, so we rotate by 2.

3. The algorithm uses the reversal technique, which is efficient and avoids
   creating a new array.

4. Step 1: reverse the entire array
      reverse(arr, 0, size - 1);
   This transforms the array into the reverse order.
   Example: [1, 2, 3, 4, 5] -> [5, 4, 3, 2, 1]

5. Step 2: reverse the first k elements
      reverse(arr, 0, k - 1);
   This puts the last k elements from the original array in the front.
   Example after full reverse: [5, 4, 3, 2, 1]
   k = 2 -> reverse first 2 -> [4, 5, 3, 2, 1]

6. Step 3: reverse the remaining elements from index k to size - 1
      reverse(arr, k, size - 1);
   This restores the order of the remaining elements.
   Example: [4, 5, 3, 2, 1] -> [4, 5, 1, 2, 3]

7. Final result is the array rotated by k positions.

Why this works:
- Reversing the whole array flips the order.
- Reversing the prefix brings the shifted elements to the front.
- Reversing the suffix restores the original order of the elements that are
  not rotated.

This method runs in O(n) time because each element is swapped a constant number
of times, and it uses O(1) extra space.
*/