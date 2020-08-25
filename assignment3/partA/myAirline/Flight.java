package myAirline;
import java.util.ArrayList;

public class Flight {
    private int availableSeats, price;
    private String origin, desString;

    Flight(String origin, String destination, int availableSeats, int price) {
        this.origin = origin;
        this.destination = destination;
        this.price = price;
        this.availableSeats = availableSeats;
    }

    String getOrigin() {
        return this.origin;
    }

    String getDestination() {
        return this.desString;
    }

    int getPrice() {
        return this.price;
    }

    int getAvailableSeats() {
        return this.availableSeats;
    }

    void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    // int getMinPrice(arrayList<Flight> flights){
    //     return getMinPrice(arrayList<Flight> flights)
    // }

    static Flight minPrice(ArrayList<Flight> flights){
        int minimumPrice = 100000;
        for(int i = 0;i<flights.size();i++))
        {
            if(flights.get(i).getPrice()<minimumPrice)
            {
                minimumPriceidx = i;
            }
        }
        return flights.get(minimumPriceidx);

    }
}