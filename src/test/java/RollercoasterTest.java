import Attractions.Rollercoaster;
import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;
    Rollercoaster rollercoaster;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("Some Rollercoaster");
        visitor1 = new Visitor(18, 183, 40);
        visitor2 = new Visitor(9, 183, 40);
        visitor3 = new Visitor(16, 92, 40);
    }

    @Test
    public void hasName(){
        assertEquals("Some Rollercoaster", rollercoaster.getName());
    }

    @Test
    public void acceptsVisitorBasedOnHeightAndAge(){
        rollercoaster.addVisitor(visitor1);
        assertEquals(1, rollercoaster.getVisitorsCount());
    }

    @Test
    public void rejectsVisitorBasedOnHeight(){
        rollercoaster.addVisitor(visitor3);
        assertEquals(0, rollercoaster.getVisitorsCount());
    }

    @Test
    public void rejectsVisitorBasedOnAge(){
        rollercoaster.addVisitor(visitor2);
        assertEquals(0, rollercoaster.getVisitorsCount());
    }


}
