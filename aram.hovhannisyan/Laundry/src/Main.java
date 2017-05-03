/**
 * Created by aram.hovhannisyan on 5/3/2017.
 */
public class Main {
    public static void main(String[] args) {
        Cloth[] cloths = {new Cloth(500), new Cloth(400)};

        WashingMachine machine = Laundry.requestWashingMachine(cloths);

        if (machine == null) {
            System.out.println("can't get machine");
        } else {
            machine.wash(cloths);
        }
    }
}
