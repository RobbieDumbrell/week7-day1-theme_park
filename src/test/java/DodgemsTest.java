import Attractions.Dodgems;
import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {
    Visitor visitor;
    Visitor visitor2;
    Dodgems dodgems;

    @Before
    public void before(){
        visitor = new Visitor(18, 170, 40);
        visitor2 = new Visitor(9, 170, 40);
        dodgems = new Dodgems("Some Dodgems");
    }

    @Test
    public void hasName(){
        assertEquals("Some Dodgems", dodgems.getName());
    }

    @Test
    public void canIncreaseVisitors(){
        dodgems.addVisitor(visitor);
        assertEquals(1, dodgems.getVisitorsCount());
    }

    @Test
    public void canDecreaseVisitors(){
        dodgems.addVisitor(visitor);
        dodgems.removeVisitor(visitor);
        assertEquals(0, dodgems.getVisitorsCount());
    }

    @Test
    public void chargesDefaultPriceOver11(){
        assertEquals(4.50, dodgems.priceFor(visitor), 0);
    }

    @Test
    public void chargesHalfPriceUnder12(){
        assertEquals(2.25, dodgems.priceFor(visitor2), 0);
    }

}
