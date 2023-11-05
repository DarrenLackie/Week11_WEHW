import airline.Flight;
import airline.FlightManager;
import airline.PlaneType;
import org.junit.Before;
import org.junit.Test;
import people.CrewRank;
import people.Passenger;
import people.Pilot;

import javax.swing.*;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    FlightManager flightmanager;
    Flight flight;
    Pilot pilot;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;

    @Before
    public void before(){
        flightmanager = new FlightManager();
        pilot = new Pilot("James Watson", "FL1001", CrewRank.CAPTAIN);
        passenger1 = new Passenger("Chris Smith", 2);
        passenger2 = new Passenger("Alex Smith", 1);
        passenger3 = new Passenger("Sean Smith", 2);
        flight = new Flight(pilot, PlaneType.BOEING737, "FL1001", "JFK", "EDI", "10:00");
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        flight.bookPassenger(passenger3);
    }

    @Test
    public void canAddFlight(){
        flightmanager.addFlight(flight);
        assertEquals(1, flightmanager.getFlights().size());
    }

    @Test
    public void canRemoveFlight(){
        flightmanager.addFlight(flight);
        flightmanager.removeFlight(flight);
        assertEquals(0, flightmanager.getFlights().size());
    }

    @Test
    public void canCalculateBaggageWeightPerFlight(){
        assertEquals(500, flightmanager.calculateReservedBaggageWeight(flight));
    }

    @Test
    public void canCalculateBaggageWeightPerPassenger(){
        assertEquals(5, flightmanager.calculateBaggageWeightPerPassenger(flight));
    }

    @Test
    public void canCheckBookedWeight(){
        assertEquals(25, flightmanager.calculateBaggageBooked(flight));
    }

    @Test
    public void canCheckAvailableBaggageWeight(){
        assertEquals(475, flightmanager.calculateRemainingWeightForBaggage(flight));
    }

}
