import java.util.ArrayList;
import java.util.Scanner;

class Store {
    ArrayList<Book>books;
    Purchasing purchase;
    Sales sale;

    Store(ArrayList<Book> books) {
        this.books=books;
        this.purchase=new Purchasing(books); //Creating an object of purchasing class
        this.sale=new Sales(books);//Creating an object of sales class
    }
}