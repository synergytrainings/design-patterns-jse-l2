/**
 * Created by Sipan on 4/30/2017.
 */
public class Main {
    public static void main(String[] args) {
        PipeFactory factory = new PipeFactory();

        Pipe p1 = factory.getPipe();
        System.out.println(p1 == null);
        Pipe p2 = factory.getPipe();
        System.out.println(p2 == null);


        Pipe p3 = factory.getPipe();
        System.out.println(p3 == null);

        factory.release(p1);

        Pipe p4 = factory.getPipe();
        System.out.println(p4 == null);

    }
}
