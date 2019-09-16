package fourthFactoryPattern;

import fourthFactoryPattern.pizza.Pizza;

public class NYPizzaStore extends PizzaStore{

    @Override
    Pizza createPizza(String item) {
        if(item.equals("cheese")){
            return new NYStyleCheesePizza();
        } else if(item.equals("veggie")){
            return new NYStyleVeggiePizza();
        } else if(item.equals("clam")){
            return new NYStyleClamPizza();
        } else if(item.equals("prepperoni")){
            return new NYStyleCheesePizza();
        }else {
            return null;
        }
    }
}
