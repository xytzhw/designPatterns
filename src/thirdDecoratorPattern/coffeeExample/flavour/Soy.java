package thirdDecoratorPattern.coffeeExample.flavour;

import thirdDecoratorPattern.coffeeExample.Beverage;
import thirdDecoratorPattern.coffeeExample.CondimentDecorator;

public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return .30+beverage.cost();
    }
}
