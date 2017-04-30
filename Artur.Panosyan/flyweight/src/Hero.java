/**
 * Created by arthur.panosyan on 4/30/2017.
 */
public class Hero {
    private String country;
    private String city;

    public Hero(String country, String city) {
        this.country = country;
        this.city = city;
    }

    public void mission(String quest, String skill) {
        System.out.println("I " + quest + " using my " + skill + " skill.");
    }
}
