package thirdDecoratorPattern.dogExample;

public class ClientTest {
    public static void main(String[] args) {
        Component component = new ConcreteCompenent();
        System.out.println("-------装饰前：--------");
        component.function();
        Component newComponent = new ConcreteDecorator(component);
        System.out.println("------装饰后:-------");
        newComponent.function();
    }
}
