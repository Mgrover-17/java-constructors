class Book {

    public String ISBN; 
    protected String title; 
    private String author;

    Book(String ISBN, String title, String author){
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor(){
        return author;
    }

    // Public method to modify CGPA (setter)
    public void setAuthor(String author) {
        this.author = author;
    }

    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }      
}

class Ebook extends Book {
    private double fileSize;

     // Constructor for EBook (calls parent constructor)
     Ebook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    // Method to display student details including protected member
    public void displayEBookDetails() {
        System.out.println("E-Book Details:");
        System.out.println("ISBN: " + ISBN); // Public: Accessible
        System.out.println("Title: " + title); // Protected: Accessible in subclass
        // System.out.println("Author: " + author); //Not Accessible (Private)
        System.out.println("File Size: " + fileSize + "MB");
    }
}


public class BookLibrarySystem{
    public static void main(String[] args){
        Book book1 = new Book("978-3-16-148410-0", "Java Programming", "John");
        System.out.println("Book Details:");
        book1.displayBookDetails();

        // Modifying the author using setter method
        book1.setAuthor("Jane Smith");
        System.out.println("\nUpdated Book Details:");
        book1.displayBookDetails();

         // Creating an EBook object
         Ebook ebook1 = new Ebook("978-1-23-456789-0", "Python Essentials", "Manvi", 2.5);
         System.out.println("\nEBook Details:");
         ebook1.displayEBookDetails();
    }
}