package thirdDecoratorPattern.dogExample;

/**
 * 装饰角色
 */
public class Decorator implements Component{

    //持有一个Component类型的对象引用
    private Component component;

    public Decorator(Component component){
        this.component = component;
    }

    @Override
    public void function() {
        component.function();
    }
}
