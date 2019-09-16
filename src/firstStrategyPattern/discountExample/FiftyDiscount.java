package firstStrategyPattern.discountExample;

public class FiftyDiscount extends Diacount{

    public FiftyDiscount(Double discoutRate) {
        super(discoutRate);
    }

    public void discount(){
        System.out.println("满50打折为"+discoutRate);
    }
}
