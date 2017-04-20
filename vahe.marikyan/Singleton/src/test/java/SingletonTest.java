import java.io.IOException;

/**
 * Created by VaheMarikyan on 4/12/17.
 */
public class SingletonTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
        SingletonTest st = new SingletonTest();
        st.testThreadSafeSingleton();

        System.out.println(ApplicationManager.getInstance().getApplicationName());

        NetworkConnection connection = NetworkConnection.getConnection();
        connection.setAddressType("DHCP");
        connection.setDefaultGateway("192.168.1.1");
        connection.setIpAddress("192.168.1.101");

        connection.connect();

    }

    public void testThreadSafeSingleton() throws InterruptedException {
        final int SIZE = 100;
        Thread[] threads = new Thread[SIZE];

        for (int i = 0; i < SIZE; i++) {
            threads[i] = new Thread(new ProcessingThread());
            threads[i].start();
        }

        System.out.print("Instance count: " + ThreadSafeSingleton.getInstanceCount() + "\n");
    }

    private class ProcessingThread implements Runnable {
        @Override
        public void run() {
            ThreadSafeSingleton.getInstance();
        }
    }
}
