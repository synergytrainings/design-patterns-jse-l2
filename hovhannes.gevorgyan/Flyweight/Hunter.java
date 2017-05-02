/**
 * Created by hovhannes.gevorgyan on 01-May-17.
 */
public class Hunter {
    private String name;

    public Hunter(String name) {
        this.name = name;
    }

    public void shoot() {
        System.out.print(name + " shoots: ");
    }

    public boolean isShootSuccessful() {
        int success = (int) (10 * Math.random());
        return success > 5;
    }
}
