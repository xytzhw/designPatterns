package fourthFactoryPattern.pizza;

public class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("芝士披萨准备");
    }

    @Override
    public void bake() {
        System.out.println("芝士披萨烘焙");
    }

    @Override
    public void cut() {
        System.out.println("芝士披萨切割");
    }

    @Override
    public void box() {
        System.out.println("芝士披萨装箱");
    }
}
