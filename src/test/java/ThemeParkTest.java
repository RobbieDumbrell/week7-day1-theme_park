import Attractions.Dodgems;
import Attractions.Rollercoaster;
import Interfaces.IReviewed;
import Stalls.IceCreamStall;
import Stalls.TobaccoStall;
import ThemeParks.ThemePark;
import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    Visitor visitor1;
    Visitor visitor2;
    Dodgems dodgems;
    Rollercoaster rollercoaster;
    IceCreamStall iceCreamStall;
    TobaccoStall tobaccoStall;
    ThemePark themePark;


    @Before
    public void before(){
        visitor1 = new Visitor(18, 170, 40);
        visitor2 = new Visitor(14, 160, 40);
        dodgems = new Dodgems("Some Dodgems");
        rollercoaster = new Rollercoaster("Some Rollercoaster");
        iceCreamStall = new IceCreamStall("Some Ice Cream Stall", "Robbie", 999);
        tobaccoStall = new TobaccoStall("Some Tobacco Stall", "Robbie", 998);
        themePark = new ThemePark();

        themePark.addAttraction(rollercoaster);
        themePark.addAttraction(dodgems);
        themePark.addStall(iceCreamStall);
        themePark.addStall(tobaccoStall);
    }

    @Test
    public void hasAttractions(){
        assertEquals(2, themePark.getAttractions().size());
    }

    @Test
    public void hasStalls(){
        assertEquals(2, themePark.getStalls().size());
    }

    @Test
    public void visitorCanVisitAttraction(){
        themePark.visit(visitor1, rollercoaster);
        assertEquals(1, rollercoaster.getVisitorsCount());
    }

    @Test
    public void canReturnAllReviewed(){
        ArrayList<IReviewed> expected = new ArrayList<>();
        expected.add(rollercoaster);
        expected.add(dodgems);
        expected.add(iceCreamStall);
        expected.add(tobaccoStall);
        assertEquals(expected, themePark.getAllReviewed());
    }
}
