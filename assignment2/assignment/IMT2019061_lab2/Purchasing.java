import java.util.ArrayList;
import java.util.Scanner;

class Purchasing {
    private double factor=1.5;
    private double sellingPrice;
    ArrayList<Book>books;

    Purchasing(ArrayList<Book> books) {
        this.books=books;
    }

    void addBook(int year, double purchasingPrice) {       //Method to add book everytime a new book is purchases
        sellingPrice=factor * purchasingPrice;      
        Book newBook=new Book(sellingPrice, year, purchasingPrice);   //Creating a new book
        this.books.add(newBook);        //Adding the new book into the collection
    }
}