package thirdDecoratorPattern.coffeeExample.coffee;

import thirdDecoratorPattern.coffeeExample.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend(){
        description = "House Blend Coffee";
    }

    /**
     * 这是另一种饮料，做法和Espresso一样，只是把Espresso名称改为"House Blend Coffee",
     * 并且返回正确的价钱$0.89。
     * @return
     */
    @Override
    public double cost() {
        return .89;
    }
}
