package firstStrategyPattern.carExample;

/**
 * 具体策略实现子类
 */
public class BussCar extends Car {

    public BussCar(String name, String color) {
        super(name, color);
    }

    public void run(){
        System.out.println(color + " " + name + "在缓慢的行驶。。。");
    }
}
