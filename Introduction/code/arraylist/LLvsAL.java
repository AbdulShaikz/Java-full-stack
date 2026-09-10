import java.util.ArrayList;
import java.util.LinkedList;

public class LLvsAL {
	public static void main(String[] args) {
		final int elements = 10_000;

		ArrayList<Integer> arrayList = new ArrayList<>();
		long arrayListStart = System.nanoTime();
		for (int i = 0; i < elements; i++) {
			arrayList.add(0, i);
		}
		long arrayListTime = System.nanoTime() - arrayListStart;

		LinkedList<Integer> linkedList = new LinkedList<>();
		long linkedListStart = System.nanoTime();
		for (int i = 0; i < elements; i++) {
			linkedList.add(0, i);
		}
		long linkedListTime = System.nanoTime() - linkedListStart;

		System.out.println("ArrayList:  " + arrayListTime + " ns");
		System.out.println("LinkedList: " + linkedListTime + " ns");
		System.out.println("ArrayList shifts elements when inserting at index 0.");
		System.out.println("LinkedList links a new node at the beginning.");
	}
}
