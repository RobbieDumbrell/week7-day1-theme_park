import Stalls.TobaccoStall;
import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    Visitor visitor1;
    Visitor visitor2;
    TobaccoStall tobaccoStall;

    @Before
    public void before(){
        tobaccoStall = new TobaccoStall("Some Tobacco Stall", "Jonny", 20);
        visitor1 = new Visitor(20, 160, 40);
        visitor2 = new Visitor(16, 160, 40);
    }

    @Test
    public void hasName(){
        assertEquals("Some Tobacco Stall", tobaccoStall.getName());
    }

    @Test
    public void hasOwnerName(){
        assertEquals("Jonny", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals(20, tobaccoStall.getParkingSpot());
    }

    @Test
    public void acceptsVisitorBasedOnAge(){
        tobaccoStall.addVisitor(visitor1);
        assertEquals(1, tobaccoStall.getVisitorsCount());
    }

    @Test
    public void rejectsVisitorBasedOnAge(){
        tobaccoStall.addVisitor(visitor2);
        assertEquals(0, tobaccoStall.getVisitorsCount());
    }
}
