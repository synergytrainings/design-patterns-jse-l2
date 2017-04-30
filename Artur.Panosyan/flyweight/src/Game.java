import java.util.ArrayList;
import java.util.List;

/**
 * Created by arthur.panosyan on 4/30/2017.
 */
public class Game {
    private List<Hero> heroes = new ArrayList<>();
    private static Game game;

    public void start() {
        if (game == null) {
            game = new Game();
        }
    }

    public void end() {
        game = null;
    }

    public void addHero(Hero hero) {
        heroes.add(hero);
    }
}
