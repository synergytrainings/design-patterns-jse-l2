/**
 * Created by VaheMarikyan on 4/16/17.
 */
public class ApplicationManager {

    private ApplicationManager() {}

    public static ApplicationManager getInstance() {
        return AppManagerSingletonInstaceHolder.INSTANCE;
    }

    private static class AppManagerSingletonInstaceHolder {
        private static final ApplicationManager INSTANCE = new ApplicationManager();
    }


    public String getApplicationName() {
        return "My name is application";
    }

    // other methods
}
