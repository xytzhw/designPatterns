package fifthSingleton;

public class Singleton {
    //利用一个静态变量来记录Singleton类的唯一实例
    private static Singleton uniqueInstance;

    //这里是其他的有用实例变量
    private Singleton(){

    }

    public static synchronized Singleton getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
