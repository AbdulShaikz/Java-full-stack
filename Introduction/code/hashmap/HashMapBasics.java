import java.util.HashMap;
import java.util.Map;

public class HashMapBasics {
	public static void main(String[] args) {
		HashMap<String, Integer> productPrices = new HashMap<>();

		productPrices.put("Laptop", 75000);
		productPrices.put("Mouse", 1200);
		productPrices.put("Keyboard", 2500);

		productPrices.put("Mouse", 1000); // Update
		productPrices.remove("Keyboard"); // Remove

		for (Map.Entry<String, Integer> entry : productPrices.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}

// Learning points:
// 1. HashMap stores data as key-value pairs.
// 2. Keys are unique; adding an existing key updates its value.
// 3. remove() deletes an entry using its key.
// 4. entrySet() can be used to iterate through all key-value pairs.
