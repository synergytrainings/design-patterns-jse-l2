/**
 * Created by arthur.panosyan on 5/15/2017.
 */

public class Game {
    private Hero hero;
    private Game game;

    public void start() {
        if (game == null) {
            game = new Game();
        }
    }

    public void end() {
        game = null;
        hero = null;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }
}
