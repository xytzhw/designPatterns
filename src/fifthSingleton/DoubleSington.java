package fifthSingleton;

/**
 * 双重检查加锁
 */
public class DoubleSington {

    private volatile static DoubleSington uniqueInstance;

    private DoubleSington(){

    }

    public static DoubleSington getInstance(){
        if(uniqueInstance == null){
            synchronized (DoubleSington.class){
                if(uniqueInstance == null){
                    uniqueInstance = new DoubleSington();
                }
            }
        }
        return uniqueInstance;
    }

}
