import java.util.ArrayList;
import java.util.List;

/**
 * Created by arthur.panosyan on 4/10/2017.
 */

public final class ConnectionPool {
    private static ConnectionPool connectionPool = null;
    private static List<Connect> freeConnections = new ArrayList<Connect>();
    private static List<Connect> connections = new ArrayList<Connect>();
    private static short countOfFreeConnections;
    private static short countOfConnections;

    static {
        for (int i = 0; i < 100; i++) {
            ConnectionPool.freeConnections.add(new Connect());
        }

        ConnectionPool.countOfFreeConnections = 100;
        ConnectionPool.countOfConnections = 0;
    }

    private ConnectionPool() {
    }

    public static ConnectionPool getInstance() {
        if (connectionPool == null) {
            connectionPool = new ConnectionPool();
        }
        return connectionPool;
    }

    public Connect getConnection() {
        if (countOfFreeConnections == 0) {
            System.out.println("Sorry. Now free connection don't exist.");
            return null;
        }
        connections.add(freeConnections.get(countOfFreeConnections - 1));
        countOfConnections++;
        freeConnections.remove(countOfFreeConnections - 1);
        countOfFreeConnections--;
        System.out.println("Count of free connections " + countOfFreeConnections);
        System.out.println("Count of connections " + countOfConnections + "\n");
        return connections.get(countOfConnections - 1);
    }

    public void close(Connect con) {
        connections.remove(con);
        freeConnections.add(con);
        countOfConnections--;
        countOfFreeConnections++;
        System.out.println("Close\nCount of free connections " + countOfFreeConnections);
        System.out.println("Count of connections " + countOfConnections + "\n");
    }


}