package thirdDecoratorPattern.coffeeExample.flavour;

import thirdDecoratorPattern.coffeeExample.Beverage;
import thirdDecoratorPattern.coffeeExample.CondimentDecorator;

public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Whip";
    }

    @Override
    public double cost() {
        return .14 + beverage.cost();
    }
}
