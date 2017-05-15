package meruzhan_gasparyan.iterator;

/**
 * Created by meruzhan.gasparyan on 15-May-17.
 */
public class Station {

    private String [] stations ;


    public Station(String[] stations) {
        this.stations = stations;
    }


    public IteratorStation getIterator(){
        return new IteratorStation();
    }

    public  class IteratorStation{

        private int count = -1;
        public boolean hasNex(){
            return count<stations.length-1;
        }

        public String next(){
            return stations[++count];
        }
    }

}
