package firstStrategyPattern.duck;

/**
 * 这是一个接口，所有飞行类都实现它，所有新的飞行类都必须实现fly()方法
 */
public interface FlyBehavior {

    void fly();

}