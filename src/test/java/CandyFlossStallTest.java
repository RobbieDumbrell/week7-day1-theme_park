import Stalls.CandyFlossStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    CandyFlossStall candyFlossStall;

    @Before
    public void before(){
        candyFlossStall = new CandyFlossStall("Some Candy Floss Stall", "Martin", 74);
    }

    @Test
    public void hasName(){
        assertEquals("Some Candy Floss Stall", candyFlossStall.getName());
    }

    @Test
    public void hasOwnerName(){
        assertEquals("Martin", candyFlossStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals(74, candyFlossStall.getParkingSpot());
    }

    @Test
    public void haDefaultPrice(){
        assertEquals(4.20, candyFlossStall.defaultPrice(), 0);
    }
}
