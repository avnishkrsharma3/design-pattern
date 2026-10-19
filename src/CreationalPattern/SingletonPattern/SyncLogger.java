package CreationalPattern.SingletonPattern;

/**
 * @author Avnish
 * @date 20-10-2026
 */
public class SyncLogger {
    private static volatile SyncLogger instance;
    private SyncLogger() {System.out.println("loggerSycn");}
    private static volatile int count = 0;

    public synchronized static SyncLogger getLoggerSycn(){

        if(instance == null){
            instance = new SyncLogger();
            System.out.println("instance is not null -> " + count);
            count++;
        }
        return instance;
    }
}
