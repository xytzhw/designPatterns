package firstStrategyPattern.duck;

public class FluRocketPoeared implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
