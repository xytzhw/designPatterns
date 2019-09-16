package thirdDecoratorPattern.coffeeExample;

/**
 * 首先，必须让Condiment Decorator能够取代Beverage，所以将CondimentDecorator扩张自Beverage类
 */
public abstract class CondimentDecorator extends Beverage{
    //所有的调料装饰者都必须重新实现setDescription()方法
    public abstract String getDescription();
}
