import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * Created by Erik on 4/1/2017.
 */
public final class SingletonCar {
    private String mark;
    private String model;
    private String number;
    private static int countOfObjects = 0;

    public static int getCountOfObjects() {
        return countOfObjects;
    }

    private static SingletonCar instance;

    private SingletonCar() {
        mark = "";
        model = "";
        number = "";
        ++countOfObjects;
    }

    //lazy instantiation
    public static synchronized SingletonCar getInstance() {
        if(instance == null) {
            instance = new SingletonCar();
        }
        return instance;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumber() {
        return this.number;
    }

    public boolean setNumber(String number) {
        Pattern pattern = Pattern.compile("([0-9]{2})([a-zA-Z]{2})([0-9]{3})");
        Matcher matcher = pattern.matcher(number);
        if(matcher.matches()) {
            this.number = number;
            return true;
        }
        return false;
    }

    public SingletonPerson getRider() {
        return SingletonPerson.getInstance();
    }

    @Override public String toString() {
        if(SingletonPerson.getInstance() == null || this.mark.equals("") || this.model.equals("") || this.number.equals("")) {
            return "Car is not fully initialized.\nPlease set Rider, mark  and model.";
        }
        return SingletonPerson.getInstance() + ", your car is " + this.mark + " " + this.model + " with number " + this.number;
    }
}
