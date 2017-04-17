/**
 * Created by arthur.panosyan on 4/15/2017.
 */
public class Main {
    public static void main(String[] args) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connect con1 = pool.getConnection();
        Connect con2 = pool.getConnection();
        Connect con3 = pool.getConnection();
        Connect con4 = pool.getConnection();
        Connect con5 = pool.getConnection();
        pool.close(con1);
        pool.close(con2);
        pool.close(con3);
        pool.close(con4);
        pool.close(con5);
    }
}
