package firstStrategyPattern.discountExample;

public class Diacount implements DiscountFunction{

    protected Double discoutRate;

    public Diacount(Double discoutRate){
        this.discoutRate = discoutRate;
    }

    @Override
    public void discount() {
        System.out.println("折扣率为" + discoutRate);
    }
}
