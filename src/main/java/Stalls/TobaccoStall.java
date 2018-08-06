package Stalls;

import Interfaces.ISecurity;
import Visitors.Visitor;

public class TobaccoStall extends Stall implements ISecurity {

    public TobaccoStall(String name, String ownerName, int parkingSpot){
        super(name, ownerName, parkingSpot);
        this.defaultPrice = 6.60;
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() > 18){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void addVisitor(Visitor visitor){
        if (this.isAllowedTo(visitor) == true) {
            visitors.add(visitor);
        }
    }
}
