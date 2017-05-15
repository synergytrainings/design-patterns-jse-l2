package meruzhan_gasparyan.iterator;

/**
 * Created by meruzhan.gasparyan on 15-May-17.
 */
public class Main {
    public static void main(String[] args) {

        String [] stations = new String[]{"station1","station2","station3","station4","station5","station6"};
        Station station = new Station(stations);

        Bus bus = new Bus(station,554);
        System.out.println(bus.isStart());
        bus.run();
        System.out.println(bus.isFinished());
        System.out.println(bus.isInMovie());
        System.out.println(bus.isStart());



    }
}
