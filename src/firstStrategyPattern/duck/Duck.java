package firstStrategyPattern.duck;

public class Duck {

    /**
     * 每只鸭子都会引用实现QuackBehavior接口的对象
     */
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    public void Duck(){

    }

    /**
     * 鸭子对象不亲自处理呱呱叫行为，而是委托给quackBehavior引用对象
     */
    public void performQuack(){
        quackBehavior.quack();
    }

    /**
     * 鸭子对象不亲自处理飞行行为，而是委托给flyBehavior引用对象
     */
    public void performFly(){
        flyBehavior.fly();
    }

    public void swim(){
        System.out.println("All ducks float, even decoys!");
    }

    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }
}
