package firstStrategyPattern.duck;

/**
 * 真的呱呱叫
 */
public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        //实现鸭子吱吱叫
        System.out.println("Quack");
    }
}
