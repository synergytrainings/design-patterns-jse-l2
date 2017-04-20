/**
 * Created by Anushavan on 4/16/17.
 */
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerWrapper {

    private static LoggerWrapper instance = null;
    private static final Logger log = Logger.getLogger("Test");

    private LoggerWrapper() {
        System.out.println("Logger has been created!");
    }

    public static LoggerWrapper getInstance() {
        if(instance == null) {
            prepareLogger();
            instance = new LoggerWrapper ();
        }
        return instance;
    }

    public void log(Level level, String message) {
        log.log(level, message);
    }

    private static void prepareLogger() {
        try {
            FileHandler myFileHandler = new FileHandler("/user/anushavan/logFile.log", true);
            myFileHandler.setFormatter(new SimpleFormatter());
            log.addHandler(myFileHandler);
            log.setUseParentHandlers(false);
            log.setLevel(Level.ALL);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}