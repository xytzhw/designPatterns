package firstStrategyPattern.duck;

/**
 * 这里实现了所有有翅膀的鸭子飞行动作
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        //实现鸭子飞行
        System.out.println("I'm flying!!");
    }
}
