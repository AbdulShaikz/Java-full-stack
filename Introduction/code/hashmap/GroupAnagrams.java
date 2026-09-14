import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
	public static List<List<String>> groupAnagrams(List<String> words) {
		Map<String, List<String>> groups = new HashMap<>();

		for (String word : words) {
			char[] characters = word.toCharArray();
			Arrays.sort(characters);
			String key = new String(characters);

			groups.computeIfAbsent(key, ignored -> new ArrayList<>()).add(word);
		}

		return new ArrayList<>(groups.values());
	}

	public static void main(String[] args) {
		List<String> words = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");
		System.out.println(groupAnagrams(words));
	}
}
/*
Learning concepts covered in this program:

1. HashMap and grouping by a common signature:
   - A HashMap stores data in key-value pairs.
   - Here, the key is a sorted version of each word, and the value is a list of words that share that same key.
   - Example: "eat", "tea", and "ate" all become "aet" after sorting, so they are grouped together.

2. Anagram detection using a canonical key:
   - Two words are anagrams if they have the same letters in the same frequency.
   - Sorting characters converts each word into a standard form (signature).
   - This means different anagrams produce the same sorted string and can be matched efficiently.

3. Character array sorting:
   - word.toCharArray() converts the String into a char[] array.
   - Arrays.sort(characters) sorts the characters alphabetically.
   - This creates a normalized representation of the word, independent of the original letter order.

4. computeIfAbsent:
   - The Map method computeIfAbsent(key, mappingFunction) checks if a key already exists.
   - If the key is missing, it creates a new list and stores it in the map.
   - If the key exists, it reuses the existing list, avoiding duplicate structures.

5. List of Lists result:
   - The method returns all grouped word lists as a List<List<String>>.
   - Each inner list contains all anagrams for one signature.
   - The final output preserves the grouping structure and is easy to print or process.

6. Time complexity:
   - For each word, sorting its characters takes O(k log k), where k is the word length.
   - Overall runtime is efficient enough for many practical cases.

7. Real-world use:
   - This technique is useful in text processing, word games, dictionary grouping, and similarity checks.
   - HashMaps are heavily used in problems where many items need to be organized by a common property.
*/
