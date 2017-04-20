/**
 * Created by VaheMarikyan on 4/16/17.
 */
public class NetworkConnection {

    private static NetworkConnection connection;

    private String ipAddress;

    private String addressType;

    private String defaultGateway;

    private NetworkConnection(){

    }

    public synchronized static NetworkConnection getConnection(){
        if(connection == null){
            connection = new NetworkConnection();
        }

        return connection;
    }


    public void connect(){
        // actions go here
    }

    public void disconnect(){
        // actions go here
    }


    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public String getDefaultGateway() {
        return defaultGateway;
    }

    public void setDefaultGateway(String defaulGateway) {
        this.defaultGateway = defaulGateway;
    }
}
