import airline.Plane;
import airline.PlaneType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING737);
    }

    @Test
    public void canGetPlaneType(){
        assertEquals(PlaneType.BOEING737, plane.getPlaneType());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(100, plane.getPlaneType().getCapacity());
    }

    @Test
    public void canGetTotalWeight(){
        assertEquals(1000, plane.getPlaneType().getTotalWeight());
    }

    @Test
    public void canChangePlaneType(){
        plane.setPlaneType(PlaneType.DREAMLINER);
        assertEquals(PlaneType.DREAMLINER, plane.getPlaneType());
    }

}
