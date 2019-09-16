package firstStrategyPattern.carExample;

/**
 * 具体的策略父类
 */
public class Car implements CarFunction{

    //车名称
    protected String name;
    //车颜色
    protected String color;

    public Car(String name,String color){
        this.color = color;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(color + " " + name + "在行驶。。。");
    }
}
