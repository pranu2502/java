package myAirline;
import java.util.ArrayList;

public class PriorityQueueFlight {
    private ArrayList<Flight> flights;
    PriorityQueueFlight(ArrayList<Flight> flights)
    {
        this.flights = flights;
    }

    void addFlight(Flight flight,ArrayList<Flight> flights){
        flights.add(flight);
    }

    Flight peek(ArrayList<Flight> flights){
        return Flight.minPrice(flights);
    }

    Flight pop(ArrayList<Flight> flights){
        Flight flight = Flight.minPrice(flights);
        flights.remove(flight);
        return flight;
    }

    boolean isEmpty(ArrayList<Flight> flights){
        return flights.isEmpty();
    }
}