import java.util.HashMap;
import java.util.Map;

/**
 * Created by arthur.panosyan on 4/30/2017.
 */
public class HeroFactory {
    private static Map<String, Hero> heroes = new HashMap<>();

    public static Hero createHero(String country, String city) {
        if (heroes.get(city) == null) {
            heroes.put(city, new Hero(country, city));
        }
        return heroes.get(city);
    }
}
