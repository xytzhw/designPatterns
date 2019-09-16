package firstStrategyPattern.duck;

/**
 * 这里实现了所有不会飞的鸭子的动作
 */
public class FlyNoWay implements FlyBehavior{

    @Override
    public void fly() {
        //什么都不做，不会飞
        System.out.println("I can't fly");
    }
}
