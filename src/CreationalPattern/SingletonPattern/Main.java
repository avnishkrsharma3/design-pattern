package CreationalPattern.SingletonPattern;

public class Main {
    public static void main(String[] args){
        Thread thread1  =  new Thread(()->{
            SyncLogger.getLoggerSycn();
        });
        Thread thread2  =  new Thread(()->{
            SyncLogger.getLoggerSycn();
        });
        Thread thread3  =  new Thread(()->{
            SyncLogger.getLoggerSycn();
        });
        Thread thread4  =  new Thread(()->{
            SyncLogger.getLoggerSycn();
        });
        Thread thread5  =  new Thread(()->{
            SyncLogger.getLoggerSycn();
        });
        Thread thread6  =  new Thread(()->{
            SyncLogger.getLoggerSycn();
        });
        Thread thread7  =  new Thread(()->{
            SyncLogger.getLoggerSycn();
        });
        Thread thread8  =  new Thread(()->{
            SyncLogger.getLoggerSycn();
        });
        Thread thread9  =  new Thread(()->{
            SyncLogger.getLoggerSycn();
        });
        thread1.start(); thread2.start(); thread3.start(); thread4.start(); thread5.start(); thread6.start();
        thread7.start(); thread8.start(); thread9.start();
    }
}