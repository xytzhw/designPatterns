package thirdDecoratorPattern.coffeeExample;

import thirdDecoratorPattern.coffeeExample.coffee.DarkRoast;
import thirdDecoratorPattern.coffeeExample.coffee.Espresso;
import thirdDecoratorPattern.coffeeExample.coffee.HouseBlend;
import thirdDecoratorPattern.coffeeExample.flavour.Mocha;
import thirdDecoratorPattern.coffeeExample.flavour.Soy;
import thirdDecoratorPattern.coffeeExample.flavour.Whip;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        //定一杯Espresso，不需要调料，打印出他的描述与价钱
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        //制造一个DarkRoast对象
        Beverage beverage2 = new DarkRoast();
        //用Mocha装饰它
        beverage2 = new Mocha(beverage2);
        //用第二个Mocha装饰它
        beverage2 = new Mocha(beverage2);
        //用Whip装饰它
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" +beverage2.cost());

        //最后再来一杯调料为豆浆、摩卡、奶泡的HouseBlend咖啡
        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}
