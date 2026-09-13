import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequency {
    public static void main(String[] args) {
        Map<String, Integer> frequencies = new HashMap<>();

        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim().toLowerCase();

                if (line.isEmpty()) {
                    continue;
                }

                if (line.equals("exit") || line.equals("quit")) {
                    break;
                }

                String[] words = line.split("\\s+");
                for (String word : words) {
                    frequencies.put(word, frequencies.getOrDefault(word, 0) + 1);
                }
            }
        }

        frequencies.forEach((word, count) ->
                System.out.println(word + ": " + count));
    }
}

/*
 * Learning Points:
 * 1. HashMap stores data as key-value pairs, making it useful for counting word frequencies.
 * 2. The getOrDefault() method helps avoid null checks when a key is not present yet.
 * 3. Converting input to lowercase ensures words like "Java" and "java" are counted together.
 * 4. trim() and split("\\s+") remove extra spaces and break text into individual words.
 * 5. Scanner is used to read user input line by line until the user types 'exit' or 'quit'.
 * 6. A map can be iterated with forEach to print each word and its total count.
 */