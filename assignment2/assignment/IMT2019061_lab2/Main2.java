import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    static ArrayList < Book > books = new ArrayList < Book > ();
    static Store store = new Store(books);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        while (true) {       //Taking the first set of inputs
            a = sc.nextInt();
            b = sc.nextInt();
            if (a == 0 && b == 0) {
                break;              //Exiting the loop if 0 0 are given as input
            }
            store.purchase.addBook(a, b);  //Adding the book into the list everytime an input is given
        }

        String str;
        while (true) {     //Taking the second set of inputs
            a = sc.nextInt();
            str = sc.nextLine();
            str = str.replace(" ", "");
            if (a == 0) {               //Exiting the loop if 0 0 are given as input
                break;
            }
            store.sale.addRevenue(a, str);  //Adding the revenue after selling the book in the respective fields
        }
        sc.close();

        store.sale.printSales();   //Printing the sales

    }
}