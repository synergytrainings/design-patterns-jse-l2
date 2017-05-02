package designPatterns.creational.singleton;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author Siranush.Avetisyan
 * @since 4/12/2017
 */
public class Configuration {
    private static Configuration INSTANCE;

    private Properties props = null;

    private Configuration() {
        this.props = new Properties();
        InputStream input = null;

        try {

            String filename = "config.properties";
            input = getClass().getClassLoader().getResourceAsStream(filename);
            if (input == null) {
                System.out.println("Sorry, unable to find " + filename);
                return;
            }

            this.props.load(input);

            //get the property value and print it out
            System.out.println(this.props.getProperty("database"));
            System.out.println(this.props.getProperty("dbuser"));
            System.out.println(this.props.getProperty("dbpassword"));

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static Configuration getInstance() {
        if (INSTANCE == null) {
            synchronized (Configuration.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Configuration();
                }
            }
        }
        return INSTANCE;
    }

    public String getProperty(String key) {
        String value = null;
        if (this.props.containsKey(key)) {
            value = (String) this.props.get(key);
        }
        return value;
    }
}
