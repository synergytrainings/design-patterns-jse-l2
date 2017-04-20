/**
 * Created by Anushavan on 4/16/17.
 */
import java.util.logging.Level;

public class PersonForm {

    private Person person;
    private LoggerWrapper logger = LoggerWrapper.getInstance();

    public PersonForm() {
        initPerson();
    }

    private void initPerson() {
        person = new Person();
        person.setId(1);
        person.setName("Anushavan");
        person.setAge(23);
    }

    public void logPersonInfo() {
        logger.log(Level.INFO, person.toString());
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
