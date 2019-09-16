package fourthFactoryPattern.pizza;

public class VeggiePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("素食披萨准备");
    }

    @Override
    public void bake() {
        System.out.println("素食披萨烘焙");
    }

    @Override
    public void cut() {
        System.out.println("素食披萨切割");
    }

    @Override
    public void box() {
        System.out.println("素食披萨装箱");
    }
}
