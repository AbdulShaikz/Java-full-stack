import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ContactBook {
    public static void main(String[] args) {
        Map<String, String> contacts = new HashMap<>();

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("\n--- Contact Book ---");
                System.out.println("1. Add contact");
                System.out.println("2. Search contact");
                System.out.println("3. Delete contact");
                System.out.println("4. Display all contacts");
                System.out.println("5. Exit");
                System.out.print("Choose an option: ");

                String choice = scanner.nextLine().trim();
                switch (choice) {
                    case "1":
                        System.out.print("Enter name: ");
                        String name = scanner.nextLine().trim();
                        System.out.print("Enter phone number: ");
                        String phone = scanner.nextLine().trim();
                        if (name.isEmpty() || phone.isEmpty()) {
                            System.out.println("Name and phone number cannot be empty.");
                        } else {
                            contacts.put(name, phone);
                            System.out.println("Contact saved.");
                        }
                        break;
                    case "2":
                        System.out.print("Enter name to search: ");
                        name = scanner.nextLine().trim();
                        phone = contacts.get(name);
                        System.out.println(phone == null
                                ? "Contact not found."
                                : name + ": " + phone);
                        break;
                    case "3":
                        System.out.print("Enter name to delete: ");
                        name = scanner.nextLine().trim();
                        if (contacts.remove(name) != null) {
                            System.out.println("Contact deleted.");
                        } else {
                            System.out.println("Contact not found.");
                        }
                        break;
                    case "4":
                        if (contacts.isEmpty()) {
                            System.out.println("No contacts available.");
                        } else {
                            System.out.println("\nContacts:");
                            for (Map.Entry<String, String> entry
                                    : new TreeMap<>(contacts).entrySet()) {
                                System.out.println(entry.getKey() + ": " + entry.getValue());
                            }
                        }
                        break;
                    case "5":
                        System.out.println("Goodbye!");
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }
}

/*
 * Learning points:
 * 1. HashMap stores contacts as key-value pairs for fast lookup.
 * 2. TreeMap sorts contacts alphabetically when displaying them.
 * 3. Scanner reads user input from the console.
 * 4. A switch statement handles the menu choices.
 * 5. Try-with-resources automatically closes the Scanner.
 */