package myAirline;

import java.util.ArrayList;

public class Airline {
    private ArrayList<Flight> flights;
    private PriorityQueueFlight priorityQueue;
    public Airline(){
        this.flights = flights = new ArrayList<Flight>();
        this.priorityQueue = new PriorityQueueFlight(flights);
    }

    public Flight lowestFlightTicket(){
        return priorityQueue.peek(flights);
    }

    public void bookTicket(){
        Flight flight = priorityQueue.peek(flights);
        int availableSeats = flight.getAvailableSeats();
        flight.setAvailableSeats(availableSeats-1);
    }

    public void addFlight(Flight flight)
    {
        flights.add(flight);
    }
}