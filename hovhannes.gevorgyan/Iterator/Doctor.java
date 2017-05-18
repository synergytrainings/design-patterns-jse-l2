/**
 * Created by hovhannes.gevorgyan on 5/18/2017.
 */
class Doctor {
    private String name;

    Doctor(String name) {
        this.name = name;
    }

    void heal(String patient) {
        System.out.println("Doctor " + name + " heals " + patient);
    }
}
