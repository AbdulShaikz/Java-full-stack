import java.util.Map;

public class TreeMap {
	public static void main(String[] args) {
		java.util.TreeMap<Integer, String> students = new java.util.TreeMap<>();

		students.put(103, "Charlie");
		students.put(101, "Alice");
		students.put(102, "Bob");

		for (Map.Entry<Integer, String> entry : students.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
	}
}

// Learning points:
// 1. TreeMap stores key-value pairs in ascending order of keys by default.
// 2. Duplicate keys replace their existing values.
// 3. entrySet() returns all key-value pairs for iteration.
// 4. TreeMap provides sorted map operations, such as firstKey() and lastKey().
