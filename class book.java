import java.util.Scanner;

class Book {
    String title;
    String author;
    double price;

    // Constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    void displayBook() {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : " + price);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book[] books = new Book[2];

        // Input details for two books
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter details of Book " + (i + 1));

            System.out.print("Enter Title: ");
            String title = sc.nextLine();

            System.out.print("Enter Author: ");
            String author = sc.nextLine();

            System.out.print("Enter Price: ");
            double price = sc.nextDouble();
            sc.nextLine(); // Consume newline

            books[i] = new Book(title, author, price);
            System.out.println();
        }

        // Display book details
        System.out.println("Book Details:");
        for (int i = 0; i < 2; i++) {
            books[i].displayBook();
        }

        sc.close();
    }
}
