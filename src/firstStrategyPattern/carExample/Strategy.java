package firstStrategyPattern.carExample;

public class Strategy {

    public static void main(String[] args) {
        Car smallCar = new SmallCar("路虎","黑色");
        Car bussCar = new BussCar("公交车","白色");
        Person pl = new Person("小明",20);
        pl.driver(smallCar);
        pl.driver(bussCar);
    }
}
