import Attractions.Playground;
import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Visitor visitor1;
    Visitor visitor2;
    Playground playground;

    @Before
    public void before(){
        playground = new Playground("Some Playground");
        visitor1 = new Visitor(16, 178, 20);
        visitor2 = new Visitor(11, 178, 20);
    }

    @Test
    public void hasName(){
        assertEquals("Some Playground", playground.getName());
    }

    @Test
    public void acceptsVisitorBasedOnAge(){
        playground.addVisitor(visitor2);
        assertEquals(1, playground.getVisitorsCount());
    }

    @Test
    public void rejectsVisitorBasedOnAge(){
        playground.addVisitor(visitor1);
        assertEquals(0, playground.getVisitorsCount());
    }
}
