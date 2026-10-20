package CreationalPattern.SingletonPattern;
import java.util.*;

/*
  @author Avnish
  @date 20-10-2026
 */

public class BillPughLogger {
    private BillPughLogger() {
    }

    private static class Holder {

        private static final BillPughLogger INSTANCE = new BillPughLogger();

    }

    public static BillPughLogger getInstance() {
        return Holder.INSTANCE;
    }

    public void log(String message) {
        System.out.println("[LOG] " + message);
    }

}
