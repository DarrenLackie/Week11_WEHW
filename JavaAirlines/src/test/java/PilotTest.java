import org.junit.Before;
import org.junit.Test;
import people.CrewRank;
import people.Pilot;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("James Anderson","FL1001", CrewRank.CAPTAIN);
    }

    @Test
    public void canGetLicenceNumber(){
        assertEquals("FL1001", pilot.getLicenceNumber());
    }

    @Test
    public void canGetCrewRank(){
        assertEquals(CrewRank.CAPTAIN, pilot.getCrewRank());
    }

    @Test
    public void canChangeLicenceNumber(){
        pilot.setLicenceNumber("FL1002");
        assertEquals("FL1002", pilot.getLicenceNumber());
    }

    @Test
    public void canFlyPlane(){
        assertEquals("Vroom vroom away we go!", pilot.flyPlane());
    }
}
