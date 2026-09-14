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