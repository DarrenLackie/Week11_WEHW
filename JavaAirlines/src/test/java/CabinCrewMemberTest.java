import org.junit.Before;
import org.junit.Test;
import people.CabinCrewMember;
import people.CrewRank;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember("Jennifer", CrewRank.FLIGHTATTENDANT);
    }

    @Test
    public void canGetName(){
        assertEquals("Jennifer", cabinCrewMember.getName());
    }

    @Test
    public void canGetCrewRank(){
        assertEquals(CrewRank.FLIGHTATTENDANT, cabinCrewMember.getCrewRank());
    }

    @Test
    public void canTalkToPassengers(){
        assertEquals("Sir, the seatbelt sign is still on. Please sit down", cabinCrewMember.talkToPassengers());
    }
}
