import Stalls.IceCreamStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {
    IceCreamStall iceCreamStall;

    @Before
    public void before(){
        iceCreamStall = new IceCreamStall("Some Ice Cream Stall", "Kevin", 89);
    }

    @Test
    public void hasName(){
        assertEquals("Some Ice Cream Stall", iceCreamStall.getName());
    }

    @Test
    public void hasOwnerName(){
        assertEquals("Kevin", iceCreamStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals(89, iceCreamStall.getParkingSpot());
    }
}
