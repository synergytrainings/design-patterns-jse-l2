package designPatterns.creational.singleton;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

/**
 * @author Siranush.Avetisyan
 * @since 4/12/2017
 */
public class ApplicationProperties {

    private static ApplicationProperties INSTANCE = new ApplicationProperties();

    private HashMap<String, String> properties;

    private ApplicationProperties() {
        properties = new HashMap<String, String>();
    }

    public static ApplicationProperties getInstance() {
        return INSTANCE;
    }

    public void load(String configFile) {
        FileInputStream configFileStream = null;

        try {
            configFileStream = new FileInputStream(configFile);
            load(configFileStream);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        } finally {
            try {
                if (configFileStream != null) {
                    configFileStream.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    private void load(InputStream configFileStream) {
        try {
            DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = null;

            docBuilder = docBuilderFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(configFileStream);
            doc.getDocumentElement().normalize();
            NodeList templateNodes = doc.getElementsByTagName("property");

            for (int i = 0; i < templateNodes.getLength(); i++) {
                Node templateNode = templateNodes.item(i);
                String propertyName = templateNode.getAttributes().getNamedItem("name").getNodeValue();
                String propertyValue = templateNode.getAttributes().getNamedItem("value").getNodeValue();

                properties.put(propertyName, propertyValue);
            }
        } catch (SAXException e) {
            throw new RuntimeException(e);
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getProperty(String name) {
        return properties.get(name);
    }

}
