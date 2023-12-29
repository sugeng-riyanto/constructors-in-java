// Kelas yang merepresentasikan sebuah buku dengan atribut judul dan penulis
class Book {
    private String title;
    private String author;

    // Konstruktor Default
    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
    }

    // Konstruktor Parameter
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Metode untuk menampilkan informasi buku
    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

public class ConstructorExample3 {
    public static void main(String[] args) {
        Book defaultBook = new Book(); // Menggunakan konstruktor default
        Book customBook = new Book("Java Programming", "John Doe"); // Menggunakan konstruktor parameter

        defaultBook.displayInfo(); // Output: Title: Unknown Title, Author: Unknown Author
        customBook.displayInfo(); // Output: Title: Java Programming, Author: John Doe
    }
}
