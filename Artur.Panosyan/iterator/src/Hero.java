/**
 * Created by arthur.panosyan on 5/15/2017.
 */
public class Hero {
    private String name;
    private Villain[] villains;

    public Hero(String name, Villain[] antiHeroes) {
        this.name = name;
        this.villains = antiHeroes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void killVillains(String name) {
        Iterator iterator = new Iterator();
        while (iterator.hasNext()) {
            Villain antiHero = iterator.next();
            if (antiHero != null && antiHero.getName().equals(name)) {
                iterator.deleteItem();
                return;
            }
        }
    }

    public Iterator getIterator() {
        return new Iterator();
    }

    public class Iterator {
        private int iterateCount;

        public Iterator() {
            this.iterateCount = 0;
        }

        public boolean hasNext() {
            return iterateCount < villains.length;
        }

        public Villain next() {
            return villains[iterateCount++];
        }

        public void deleteItem() {
            villains[iterateCount - 1] = null;
        }
    }
}
