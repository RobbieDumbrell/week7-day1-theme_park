package Stalls;

import Interfaces.IReviewed;
import Interfaces.ITicketed;
import Visitors.Visitor;

import java.util.ArrayList;

public abstract class Stall implements IReviewed, ITicketed {

    protected String name;
    protected String ownerName;
    protected int parkingSpot;
    protected ArrayList<Visitor> visitors;
    protected int rating;
    protected double defaultPrice;


    public Stall(String name, String ownerName, int parkingSpot){
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
        this.visitors = new ArrayList<>();

    }

    @Override
    public int getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getParkingSpot() {
        return parkingSpot;
    }

    public int getVisitorsCount(){
        return visitors.size();
    }

    public void addVisitor(Visitor visitor){
        visitors.add(visitor);
    }

    public void removeVisitor(Visitor visitor){
        visitors.remove(visitor);
    }

    @Override
    public double defaultPrice(){
        return this.defaultPrice;
    }

    @Override
    public double priceFor(Visitor visitor){
        return this.defaultPrice;
    }
}
