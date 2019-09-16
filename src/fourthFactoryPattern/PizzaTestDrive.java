package fourthFactoryPattern;

import fourthFactoryPattern.pizza.Pizza;

public class PizzaTestDrive {
    public static void main(String[] args) {
        //首先建立两个不同的店
        PizzaStore nyStore = new NYPizzaStore();
//        PizzaStore chicagoStore = new Chicago

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");
    }
}
