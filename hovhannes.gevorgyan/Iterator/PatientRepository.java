/**
 * Created by hovhannes.gevorgyan on 5/18/2017.
 */
public class PatientRepository implements Container {
    private String patients[] = {"Daniel", "George", "Mary"};

    @Override
    public Person getPerson() {
        return new NamePerson();
    }

    private class NamePerson implements Person {
        int index;

        @Override
        public boolean hasNext() {
            return index < patients.length;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return patients[index++];
            }
            return null;
        }
    }
}