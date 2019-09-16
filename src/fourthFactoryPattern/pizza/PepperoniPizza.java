package fourthFactoryPattern.pizza;

public class PepperoniPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("意大利辣香肠披萨准备");
    }

    @Override
    public void bake() {
        System.out.println("意大利辣香肠披萨烘焙");
    }

    @Override
    public void cut() {
        System.out.println("意大利辣香肠披萨切割");
    }

    @Override
    public void box() {
        System.out.println("意大利辣香肠披萨装箱");
    }
}
