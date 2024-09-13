public class Book {
    private String title;
    private String author;
    private int publicationYear;

    // Parameterized constructor
    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public static void main(String[] args) {
        // Demonstrate object creation using the parameterized constructor
        Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger", 1951);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);

        // Display information about the books
        System.out.println("Book 1:");
        System.out.println("Title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Publication Year: " + book1.getPublicationYear());

        System.out.println("\nBook 2:");
        System.out.println("Title: " + book2.getTitle());
        System.out.println("Author: " + book2.getAuthor());
        System.out.println("Publication Year: " + book2.getPublicationYear());
    }
}
