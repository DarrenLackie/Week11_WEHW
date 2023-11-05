import airline.Flight;
import airline.PlaneType;
import org.junit.Before;
import org.junit.Test;
import people.CabinCrewMember;
import people.CrewRank;
import people.Passenger;
import people.Pilot;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Pilot pilot;
    Pilot subPilot;
    Pilot firstOfficer;
    CabinCrewMember flightAttendant;
    CabinCrewMember cabinManager;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;

    @Before
    public void before(){
        pilot = new Pilot("James Smith", "FL1001", CrewRank.CAPTAIN);
        subPilot = new Pilot("John Smith", "FL2002", CrewRank.CAPTAIN);
        firstOfficer = new Pilot("Jane Anderson", "FL1002", CrewRank.FIRSTOFFICER);
        flightAttendant = new CabinCrewMember("Jamie Webster", CrewRank.FLIGHTATTENDANT);
        cabinManager = new CabinCrewMember("Darren Lackie", CrewRank.FLIGHTMANAGER);
        passenger1 = new Passenger("Bill Wilson", 2);
        passenger2 = new Passenger("Bob Bobson", 3);
        passenger3 = new Passenger("Scott Scotsman", 1);
        flight = new Flight(
                pilot,
                PlaneType.BOEING747,
                "DL705",
                "JFK",
                "EDI",
                "10:00");
    }

    @Test
    public void canGetPilot(){
        assertEquals(pilot, flight.getPilot());
    }

    @Test
    public void canGetPlane(){
        assertEquals(PlaneType.BOEING747, flight.getPlane());
    }

    @Test
    public void canGetFlightNo(){
        assertEquals("DL705", flight.getFlightNo());
    }

    @Test
    public void canGetDestination(){
        assertEquals("JFK", flight.getDestination());
    }

    @Test
    public void canGetDepartureAirport(){
        assertEquals("EDI", flight.getDepartureAirport());
    }

    @Test
    public void canGetDepartureTime(){
        assertEquals("10:00", flight.getDepartureTime());
    }

    @Test
    public void canBookPassengers(){
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        flight.bookPassenger(passenger3);
        assertEquals(3, flight.getPassengers().size());
    }

    @Test
    public void canRemovePassenger(){
        flight.bookPassenger(passenger1);
        assertEquals(1, flight.getPassengers().size());
        flight.removePassenger(passenger1);
        assertEquals(0, flight.getPassengers().size());
    }

    @Test
    public void canChangeDepartureTime(){
        flight.setDepartureTime("11:00");
        assertEquals("11:00", flight.getDepartureTime());
    }

    @Test
    public void canChangeFlightNo(){
        flight.setFlightNo("DL710");
        assertEquals("DL710", flight.getFlightNo());
    }

    @Test
    public void canChangePlaneType(){
        flight.setPlane(PlaneType.DREAMLINER);
        assertEquals(PlaneType.DREAMLINER, flight.getPlane());
    }

    @Test
    public void canChangePilot(){
        flight.setPilot(subPilot);
        assertEquals(subPilot, flight.getPilot());
    }

    @Test
    public void canChangeDestination(){
        flight.setDestination("EWR");
        assertEquals("EWR", flight.getDestination());
    }

    @Test
    public void canGetAvailableSeats(){
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        assertEquals(298, flight.getRemainingSeats());
    }
}
