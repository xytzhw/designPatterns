package firstStrategyPattern.duck;

/**
 * 名为呱呱叫，其实不会出声
 */
public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        //什么都不做，不会叫
        System.out.println("<<Silence>>");
    }
}
