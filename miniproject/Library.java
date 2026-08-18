import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isIssued;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isIssued = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void setIssued(boolean issued) {
        isIssued = issued;
    }

    @Override
    public String toString() {
        return "Book{title='" + title + "', author='" + author + "', isbn='" + isbn + "', isIssued=" + isIssued + "}";
    }
}

class LibraryManager {
    private List<Book> books;

    public LibraryManager() {
        books = new ArrayList<>();
    }

    public void addBook() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter book title: ");
        String title = sc.nextLine();
        System.out.print("Enter author: ");
        String author = sc.nextLine();
        System.out.print("Enter ISBN: ");
        String isbn = sc.nextLine();

        Book book = new Book(title, author, isbn);
        books.add(book);
        System.out.println("Book added successfully.");
    }

    public void issueBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                if (book.isIssued()) {
                    System.out.println("Book is already issued.");
                } else {
                    book.setIssued(true);
                    System.out.println("Book issued successfully: " + book.getTitle());
                }
                return;
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found.");
    }

    public void returnBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                if (book.isIssued()) {
                    book.setIssued(false);
                    System.out.println("Book returned successfully: " + book.getTitle());
                } else {
                    System.out.println("Book is not currently issued.");
                }
                return;
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found.");
    }

    public void displayAvailableBooks() {
        System.out.println("Available books:");
        boolean found = false;

        for (Book book : books) {
            if (!book.isIssued()) {
                found = true;
                System.out.println("- " + book.getTitle() + " by " + book.getAuthor() + " (ISBN: " + book.getIsbn() + ")");
            }
        }

        if (!found) {
            System.out.println("No available books.");
        }
    }
}

public class Library {
    public static void main(String[] args) {
        LibraryManager library = new LibraryManager();

        library.addBook();
        library.addBook();
        library.addBook();
        library.addBook();
        library.addBook();

        // Simulated tests for issuing and returning books
        library.issueBook("978-1-2345-6789-0");
        library.issueBook("978-1-2345-6789-1");
        library.issueBook("978-1-2345-6789-2");
        library.returnBook("978-1-2345-6789-1");
        library.displayAvailableBooks();
    }
}
