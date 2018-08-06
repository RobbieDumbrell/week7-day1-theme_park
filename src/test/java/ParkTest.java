import Attractions.Park;
import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {
    Visitor visitor;
    Park park;

    @Before
    public void before(){
        park = new Park("Some Park");
        visitor = new Visitor(18, 170, 40);
    }

    @Test
    public void hasName(){
        assertEquals("Some Park", park.getName());
    }

}
