import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        // ArrayList is a dynamic array that grows/shrinks automatically.
        // It stores objects of the same type (generic type) in order.
        ArrayList<String> cities = new ArrayList<>();

        // add() inserts elements at the end of the list.
        cities.add("New York");
        cities.add("London");
        cities.add("Paris");
        cities.add("Tokyo");
        cities.add("Berlin");

        // Printing the list shows the current order of elements.
        System.out.println("Original list: " + cities);

        // remove() deletes a matching element from the list.
        cities.remove("Paris");
        System.out.println("After removing Paris: " + cities);

        // for-each loop is used to read elements one by one.
        System.out.println("\nCities using for-each:");
        for (String city : cities) {
            System.out.println(city);
        }

        // Iterator lets us traverse the list safely and control the loop.
        System.out.println("\nCities using Iterator:");
        Iterator<String> iterator = cities.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
