package firstStrategyPattern.discountExample;

public class HundredDiscount extends Diacount {

    public HundredDiscount(Double discoutRate) {
        super(discoutRate);
    }

    public void discount(){
        System.out.println("满一百折扣率为："+discoutRate);
    }
}
