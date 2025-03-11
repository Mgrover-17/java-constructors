public class LibraryBookSystem {
    String title;
    String author;
    int price;
    boolean availability;

    LibraryBookSystem(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = true; // Book is available by default
    }

    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Availability: " + (availability ? "Available" : "Not Available"));
    }

    // Method to borrow a book
    public void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("You have successfully borrowed \"" + title + "\".");
        } else {
            System.out.println("Sorry, \"" + title + "\" is currently not available.");
        }
    }

    public static void main(String[] args) {
        LibraryBookSystem obj=new LibraryBookSystem("The Great Gatsby", "F. Scott Fitzgerald", 100);
        obj.displayBookDetails();
        System.out.println("Borrowing a book:");
        obj.borrowBook();
        obj.displayBookDetails();
    }

}
