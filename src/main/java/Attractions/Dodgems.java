package Attractions;

import Interfaces.ITicketed;
import Visitors.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    private double defaultPrice;

    public Dodgems(String name){
        super(name);
        this.defaultPrice = 4.50;
    }

    @Override
    public double defaultPrice(){
        return this.defaultPrice;
    }

    @Override
    public double priceFor(Visitor visitor){
        if (visitor.getAge() < 12){
            return (this.defaultPrice / 2);
        } else {
            return this.defaultPrice;
        }
    }
}
