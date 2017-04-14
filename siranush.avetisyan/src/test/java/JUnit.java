import designPatterns.creational.singleton.ApplicationInitializer;
import designPatterns.creational.singleton.ApplicationProperties;
import designPatterns.creational.singleton.Configuration;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Siranush.Avetisyan
 * @since 4/12/2017
 */
public class JUnit {

    @Test
    public void singletonTest() {
        ApplicationInitializer.getInstance();

        assertEquals(ApplicationProperties.getInstance().getProperty("Property1"), "1");
        assertEquals(ApplicationProperties.getInstance().getProperty("Property4"), "4");

        assertEquals(Configuration.getInstance().getProperty("dbuser"), "idmdaduser");
        assertEquals(Configuration.getInstance().getProperty("dbpassword"), "idmdaduser");
    }
}
