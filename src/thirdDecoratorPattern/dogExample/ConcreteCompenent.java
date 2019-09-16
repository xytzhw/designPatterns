package thirdDecoratorPattern.dogExample;

/**
 * 具体构建角色（对应狗）
 */
public class ConcreteCompenent  implements Component{

    @Override
    public void function() {
        System.out.println("基本功能：呼吸+觅食+睡觉");
    }
}
