package airline;

import people.Passenger;

import java.util.ArrayList;

public class FlightManager {

    private ArrayList<Flight> flights;

    public FlightManager() {
        this.flights = new ArrayList<>();
    }

    public ArrayList<Flight> getFlights() {
        return flights;
    }

    public void addFlight(Flight flight){
        flights.add(flight);
    }

    public void removeFlight(Flight flight){
        flights.remove(flight);
    }

    public int calculateReservedBaggageWeight(Flight flight){
        PlaneType planeType = flight.getPlane();
        int totalWeight = planeType.getTotalWeight();
        return totalWeight / 2;
    }

    public int calculateBaggageWeightPerPassenger(Flight flight){
        int reservedWeight = calculateReservedBaggageWeight(flight);
        int planeCapacity = flight.getPlane().getCapacity();
        return reservedWeight / planeCapacity;
    }

    public int calculateBaggageBooked(Flight flight){
        int baggageWeightPerPassenger = calculateBaggageWeightPerPassenger(flight);
        ArrayList<Passenger> passengers = flight.getPassengers();
        int totalWeightBooked = 0;
        for(Passenger passenger : passengers){
            totalWeightBooked += passenger.getNumberOfBags() * baggageWeightPerPassenger;
        }
        return totalWeightBooked;
   }

   public int calculateRemainingWeightForBaggage(Flight flight){
        int totalWeightReserved = calculateReservedBaggageWeight(flight);
        int totalWeightBooked = calculateBaggageBooked(flight);
        return totalWeightReserved - totalWeightBooked;
   }
}
