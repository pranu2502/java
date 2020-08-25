import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private String id;
    private double sellingPrice;
    private int year;
    private double purchasingPrice;
    private static int i=0;
    private static ArrayList<Integer>yearList=new ArrayList<Integer>();
    private static int[] number=new int[100000];

    Book(double sellingPrice, int year, double purchasingPrice) {
        this.year=year;
        //Generating the index for each book by comparing the number of books already buht in that year
        if (yearList.contains(year)) {
            int idx=yearList.indexOf(year);
            number[idx]+=1;
            this.id=Integer.toString(year)+'-'+String.format("%06d", number[idx]);
        }

        else {
            yearList.add(year);
            number[i]+=1;
            this.id=String.valueOf(year)+'-'+String.format("%06d", number[i]);
            i++;
        }

        this.sellingPrice=sellingPrice;
        this.purchasingPrice=purchasingPrice;
    }

    String getId() {       //getter for id
        return this.id;
    }

    int getSellingPrice() {          //getter for selling price
        return (int) this.sellingPrice;
    }

    int getPurchasingPrice() {             //getter for purchasing price
        return (int) this.purchasingPrice;
    }

    int getYear() {                     //getter for purchasing year
        return this.year;
    }

}