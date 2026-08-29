import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList of 5 city names
        ArrayList<String> cities = new ArrayList<>();
        cities.add("New York");
        cities.add("London");
        cities.add("Paris");
        cities.add("Tokyo");
        cities.add("Berlin");

        System.out.println("Original list: " + cities);

        // Remove one city
        cities.remove("Paris");
        System.out.println("After removing Paris: " + cities);

        // Iterate using a for-each loop
        System.out.println("\nCities using for-each:");
        for (String city : cities) {
            System.out.println(city);
        }

        // Iterate using an Iterator
        System.out.println("\nCities using Iterator:");
        Iterator<String> iterator = cities.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
