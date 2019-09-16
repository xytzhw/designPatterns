package fourthFactoryPattern.pizza;

public class ClamPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("蛤蜊披萨准备");
    }

    @Override
    public void bake() {
        System.out.println("蛤蜊披萨烘焙");
    }

    @Override
    public void cut() {
        System.out.println("蛤蜊披萨切割");
    }

    @Override
    public void box() {
        System.out.println("蛤蜊披萨装箱");
    }
}
