import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LHSvsHS {
	public static void main(String[] args) {
		String[] values = {"Java", "Python", "C++", "JavaScript", "Go"};

		Set<String> linkedHashSet = new LinkedHashSet<>();
		Set<String> hashSet = new HashSet<>();

		for (String value : values) {
			linkedHashSet.add(value);
			hashSet.add(value);
		}

		System.out.println("LinkedHashSet (insertion order): " + linkedHashSet);
		System.out.println("HashSet (order not guaranteed): " + hashSet);
	}
}

// Learning points:
// 1. HashSet stores unique elements and does not guarantee iteration order.
// 2. LinkedHashSet stores unique elements while preserving insertion order.
// 3. Both sets reject duplicate values.
