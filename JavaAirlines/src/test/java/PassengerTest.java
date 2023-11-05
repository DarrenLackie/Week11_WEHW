import org.junit.Before;
import org.junit.Test;
import people.Passenger;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("James Watson", 2);
    }

    @Test
    public void canGetName(){
        assertEquals("James Watson", passenger.getName());
    }

    @Test
    public void canGetNumberOfBags(){
        assertEquals(2, passenger.getNumberOfBags());
    }

    @Test
    public void canChangeNumberOfBags(){
        passenger.setNumberOfBags(3);
        assertEquals(3, passenger.getNumberOfBags());
    }

}
