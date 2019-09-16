package firstStrategyPattern.carExample;

/**
 * 具体的应用场景
 */
public class Person {
    private String name;
    private Integer age;
    private Car car;

    public void driver(Car car){
        System.out.println(name + " " + age + " 岁" + "开着");
        car.run();
    }

    public  Person(String name,Integer age){
        this.name = name;
        this.age = age;
    }
}
