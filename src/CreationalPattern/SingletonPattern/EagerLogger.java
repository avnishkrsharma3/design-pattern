package CreationalPattern.SingletonPattern;

// I want to create  a singletion EagerLogger class

public class EagerLogger {

    private static final EagerLogger EagerLogger = new EagerLogger();
    private static int count = 0;

    private EagerLogger(){

        System.out.println("loger is getting created");

    }

    public static EagerLogger getEagerLogger() {
        System.out.println(count);
        count++;
        return EagerLogger;
    }
}