import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {
    Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor(25, 183, 60);
    }

    @Test
    public void hasAge(){
        assertEquals(25, visitor.getAge());
    }

    @Test
    public void hasHeight(){
        assertEquals(183, visitor.getHeight());
    }

    @Test
    public void hasMoney(){
        assertEquals(60, visitor.getMoney());
    }
}
