package CreationalPattern.SingletonPattern;

/**
 * @author Avnish
 * @date 20-10-2026
 */
public class DoubleCheckedSyncLogger {
    private DoubleCheckedSyncLogger(){};
    private volatile static DoubleCheckedSyncLogger instance;
    public  static  DoubleCheckedSyncLogger getInstance(){
        if(instance == null){ // don't lock the class for each getInstance call (just an improvement )
            // suppost two thread came at line 11 at once
            // one will get lock but other will wait and know that instance is null
            ///  so line 16( Double checking ) is neccessary() once the other thread will get lock it can avoid to create
            synchronized (DoubleCheckedSyncLogger.class){
                if(instance == null){ // only create if instance is not null
                    instance= new DoubleCheckedSyncLogger();
                }
                return instance;
            }
        }
        return instance;
    }
    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}
