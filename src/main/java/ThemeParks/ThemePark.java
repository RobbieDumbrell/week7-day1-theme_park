package ThemeParks;

import Attractions.Attraction;
import Interfaces.IReviewed;
import Stalls.Stall;
import Visitors.Visitor;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;

    public ThemePark(){
        attractions = new ArrayList<>();
        stalls = new ArrayList<>();
    }

    public ArrayList<Attraction> getAttractions() {
        return attractions;
    }

    public ArrayList<Stall> getStalls() {
        return stalls;
    }

    public void addAttraction(Attraction attraction){
        attractions.add(attraction);
    }

    public void addStall(Stall stall){
        stalls.add(stall);
    }

    public void visit(Visitor visitor, Attraction attraction){
        attraction.addVisitor(visitor);
    }

    public ArrayList<IReviewed> getAllReviewed(){
        ArrayList<IReviewed> allReviewed = new ArrayList<>();
        allReviewed.addAll(attractions);
        allReviewed.addAll(stalls);
        return allReviewed;
    }
}
