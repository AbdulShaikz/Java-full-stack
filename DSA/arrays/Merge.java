public class Merge {
    public static int[] merge(int[] first, int[] second) {
        int[] merged = new int[first.length + second.length];
        int i = 0, j = 0, k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] <= second[j]) {
                merged[k++] = first[i++];
            } else {
                merged[k++] = second[j++];
            }
        }

        while (i < first.length) {
            merged[k++] = first[i++];
        }
        while (j < second.length) {
            merged[k++] = second[j++];
        }

        return merged;
    }

    public static void main(String[] args) {
        int[] first = {1, 3, 5};
        int[] second = {2, 4, 6};
        int[] merged = merge(first, second);

        for (int value : merged) {
            System.out.print(value + " ");
        }
    }

    /*
     * Detailed explanation:
     * merge combines two arrays that are already sorted in ascending order
     * into a new sorted array, leaving the input arrays unchanged.
     *
     * The result array has room for every element from both inputs. The
     * indices i and j point to the next unprocessed elements in first and
     * second, while k points to the next available position in merged. While
     * both arrays have elements remaining, the method compares first[i] and
     * second[j], copies the smaller value to merged[k], and advances the
     * corresponding input index and k. When values are equal, the element
     * from first is selected first.
     *
     * When either input is exhausted, the remaining elements from the other
     * input are copied directly. They are already in sorted order, so no more
     * comparisons are needed. The result contains every input value, including
     * duplicates, in ascending order (provided both inputs were sorted).
     *
     * Each element is processed once, so the time complexity is
     * O(first.length + second.length). The returned array requires
     * O(first.length + second.length) additional space.
     */
}