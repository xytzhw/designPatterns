package firstStrategyPattern.discountExample;

public class Strategy {
    public static void main(String[] args) {
        Person person = new Person("大名",31,"男");
        Diacount fifty = new FiftyDiscount(0.4);
        person.buy(fifty);
    }
}
