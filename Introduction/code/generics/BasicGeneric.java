public class BasicGeneric {
	public static <T> void printArray(T[] arr) {
		for (T item : arr) {
			System.out.println(item);
		}
	}

	public static void main(String[] args) {
		printArray(new Integer[] { 1, 2, 3 });
		printArray(new String[] { "Java", "Generics" });
	}
}

// Learning concepts:
// 1. Generics allow methods to work with different data types safely.
// 2. <T> declares a type parameter for the generic method.
// 3. T[] represents an array whose element type is T.
// 4. Type inference determines T from the argument passed to printArray.
// 5. Generics reduce the need for explicit casting.
