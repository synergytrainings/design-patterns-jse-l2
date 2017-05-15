/**
 * Created by arthur.panosyan on 5/15/2017.
 */
public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.start();

        Villain[] antiHeroes = {new Villain("Thanos"), new Villain("Loki")};

        Hero thor = new Hero("Thor", antiHeroes);

        game.setHero(thor);

        thor.killVillains("Thanos");

        Hero.Iterator iterator = thor.getIterator();
        while (iterator.hasNext()) {
            Villain antiHero = iterator.next();
            if (antiHero != null) {
                System.out.print(antiHero.getName() + ", ");
            }
        }
        System.out.println();

        game.end();
    }
}
