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
