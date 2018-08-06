package Attractions;

import Interfaces.ISecurity;
import Visitors.Visitor;

public class Rollercoaster extends Attraction implements ISecurity {

    public Rollercoaster(String name){
        super(name);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() > 11 && visitor.getHeight() > 145){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void addVisitor(Visitor visitor){
        if (isAllowedTo(visitor) == true){
            visitors.add(visitor);
        }
    }
}
