import Attractions.Dodgems;
import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {
    Visitor visitor;
    Dodgems dodgems;

    @Before
    public void before(){
        visitor = new Visitor(18, 170, 40);
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

}
