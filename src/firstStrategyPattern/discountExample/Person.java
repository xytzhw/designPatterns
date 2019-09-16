package firstStrategyPattern.discountExample;

public class Person {
    private String name;
    private Integer age;
    private String gender;

    public Person(String name, Integer age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void buy(Diacount diacount){
        System.out.println(name+" "+gender + " "+age+ "岁");
        diacount.discount();
    }
}
