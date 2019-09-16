package firstStrategyPattern.duck;

/**
 * 名为呱呱叫，其实吱吱叫
 */
public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        //橡皮鸭子吱吱叫
        System.out.println("Squeak");
    }
}
