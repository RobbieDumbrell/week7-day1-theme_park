package Attractions;

import Interfaces.ISecurity;
import Interfaces.ITicketed;
import Visitors.Visitor;

public class Rollercoaster extends Attraction implements ISecurity, ITicketed {

    private double defaultPrice;

    public Rollercoaster(String name){
        super(name);
        this.defaultPrice = 8.40;
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

    @Override
    public double defaultPrice(){
        return this.defaultPrice;
    }

    @Override
    public double priceFor(Visitor visitor){
        if (visitor.getHeight() > 200){
            return (this.defaultPrice * 2);
        } else {
            return this.defaultPrice;
        }
    }
}
