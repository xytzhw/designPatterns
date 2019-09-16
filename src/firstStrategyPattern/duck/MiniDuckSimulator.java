package firstStrategyPattern.duck;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.setFlyBehavior(new FluRocketPoeared());
        model.performFly();
    }

}
