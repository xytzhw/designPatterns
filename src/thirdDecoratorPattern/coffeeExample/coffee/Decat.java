package thirdDecoratorPattern.coffeeExample.coffee;

import thirdDecoratorPattern.coffeeExample.Beverage;

public class Decat extends Beverage {

    public Decat(){
        description = "Decat Coffee";
    }

    @Override
    public double cost() {
        return .97;
    }
}
