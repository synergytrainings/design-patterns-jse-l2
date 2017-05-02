package designPatterns.creational.singleton;

import java.io.File;

/**
 * @author Siranush.Avetisyan
 * @since 4/12/2017
 */
public class ApplicationInitializer {

    private static final String CONFIG_FILE = "web" + File.separator + "WEB-INF" + File.separator + "property.xml";

    private static ApplicationInitializer INSTANCE;

    private ApplicationInitializer() {
        init();
    }

    private void init() {
        initStartupProperties();
    }

    private void initStartupProperties() {
        ApplicationProperties.getInstance().load(CONFIG_FILE);
    }

    public static ApplicationInitializer getInstance() {
        if (INSTANCE == null) {
            synchronized (ApplicationInitializer.class) {
                if (INSTANCE == null) {
                    INSTANCE = new ApplicationInitializer();
                }
            }
        }
        return INSTANCE;
    }
}

