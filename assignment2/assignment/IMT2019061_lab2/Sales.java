import java.util.ArrayList;
import java.util.Scanner;

class Sales {
    ArrayList<Book>books;
    private static ArrayList<Integer>yearList=new ArrayList<Integer>();
    private static int[][] revenuelist=new int[100000][3];    //2d array to store the revenue generated in a year by the books bought in that year and 2 years before
    private static int j=0;

    Sales(ArrayList<Book> books) {
        this.books=books;
    }

    void addRevenue(int year, String id) {
        int idxOfBook=-1;
        int yearOfBook=0;

        for (int k=0; k < books.size(); k++) {
            if (id.equals(books.get(k).getId())) {   
                idxOfBook=k;
                yearOfBook=books.get(k).getYear();   //Finding the year in which the sold book is bought
                break;
            }
        }

        if (yearList.contains(year)) {
            if (year - yearOfBook <=2) {
                int idx=yearList.indexOf(year);
                revenuelist[idx][year - yearOfBook]+=books.get(idxOfBook).getSellingPrice(); //Adding the revenue generated in its field
            }
        }

        else {
            yearList.add(year);

            if (year - yearOfBook <=2) {
                revenuelist[j][year - yearOfBook]+=books.get(idxOfBook).getSellingPrice();  //Adding the revenue generated in its field
                j++;
            }
        }

        books.remove(idxOfBook);    //Removing the book form the list of books after it is sold
    }

    void printSales() {
        for (int k=0; k < j; k++) {                //Printing out the sales
            System.out.print(yearList.get(k));
            System.out.print(" ");
            System.out.print(revenuelist[k][0]);
            System.out.print(" ");
            System.out.print(revenuelist[k][1]);
            System.out.print(" ");
            System.out.print(revenuelist[k][2]);
            System.out.println(" ");
        }
    }
}