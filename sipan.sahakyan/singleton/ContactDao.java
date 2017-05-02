import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by Sipan on 4/16/2017.
 */
public class ContactDao {
    private static ContactDao contactDao = null;

    private Connection conn;

    private ContactDao(){
        try {
            conn = DriverManager.getConnection("url", "user", "password");
        } catch (SQLException e) {
            System.out.println("Unable to connect to the database");
            e.printStackTrace();
        }
    }

    public static ContactDao getInstance(){
        if(contactDao == null){
            contactDao = new ContactDao();
        }
        return contactDao;
    }

    public void add(Contact contact) {
        String query = "INSERT INTO Contact(firstName, lastName, phoneNumber) " +
                "VALUES (?, ?, ?)";
        try {
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, contact.getFirstName());
            statement.setString(2, contact.getLastName());
            statement.setString(3, contact.getPhoneNumber());

            statement.execute();

        } catch (SQLException e) {
            System.out.println("Unable to add contact");
            e.printStackTrace();
        }
    }
}
