/**
 * Created by arthur.panosyan on 4/30/2017.
 */
public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.start();
        Hero hero = HeroFactory.createHero("Armenia", "Gyumri");
        game.addHero(hero);
        hero.mission("save world", "fly");
        game.end();
    }
}
