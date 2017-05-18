/**
 * Created by hovhannes.gevorgyan on 5/18/2017.
 */
public class Demo {
    public static void main(String[] args) {
        PatientRepository patients = new PatientRepository();
        Doctor doctor = new Doctor("Aibolit");

        for (Person person = patients.getPerson(); person.hasNext(); ) {
            String patient = (String)person.next();
            doctor.heal(patient);
        }
    }
}
