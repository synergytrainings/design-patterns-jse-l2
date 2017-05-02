import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Sipan on 5/1/2017.
 */
public class PipeFactory {
    private static final Map<Pipe,Boolean> pipes = new HashMap<>();

    public PipeFactory(){
        pipes.put(new Pipe(),false);
        pipes.put(new Pipe(),false);
    }

    public Pipe getPipe(){

        Set<Pipe> pipeSet = pipes.keySet();

        Pipe pipe = null;

        for (Pipe p : pipeSet){
            if(!pipes.get(p)){
                pipes.put(p, true);
                pipe = p;
                break;
            }
        }

        if(pipe != null){
            PipeReleaseTask releaseTask = new PipeReleaseTask(pipe);
            new Thread(releaseTask).start();
        }

        return pipe;
    }

    public void release(Pipe pipe){
        pipes.put(pipe, false);
    }

    private class PipeReleaseTask implements Runnable{

        private final Pipe pipe;

        private PipeReleaseTask(Pipe pipe) {
            this.pipe = pipe;
        }

        @Override
        public void run() {
            try{
                Thread.sleep(5000);
                release(pipe);
            }catch (InterruptedException ignored){

            }
        }
    }
}
