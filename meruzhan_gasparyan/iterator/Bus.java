package meruzhan_gasparyan.iterator;

/**
 * Created by meruzhan.gasparyan on 15-May-17.
 */
public class Bus {
    private Station stations;
    private int busNumber;
    private StateMoving movingState;

    public Bus(Station stations, int busNumber) {
        this.stations = stations;
        this.busNumber = busNumber;
        this.movingState = StateMoving.START;
    }


    public void run(){

        if (movingState == StateMoving.IN_MOVIE){
            throw new RuntimeException();
        }
        movingState = StateMoving.IN_MOVIE;
        Station.IteratorStation iterator =  stations.getIterator();
        while (iterator.hasNex()){
            System.out.println(iterator.next());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        movingState = StateMoving.FINISHED;

    }

    public boolean isFinished(){
       return movingState == StateMoving.FINISHED;
    }

    public boolean isStart(){
        return movingState == StateMoving.START;
    }

    public boolean isInMovie(){
        return movingState == StateMoving.IN_MOVIE;
    }

}
