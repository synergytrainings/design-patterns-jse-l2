import java.util.Arrays;
import java.util.Map;

/**
 * Created by aram.hovhannisyan on 5/3/2017.
 */
public class Laundry {
    private static Map<WashingMachine, Boolean> washingMachineInUse;

    public static WashingMachine requestWashingMachine(Cloth[] cloths) {
        float weight = Arrays.stream(cloths).map(cloth -> cloth.getWeight()).reduce(Float::sum).get();

        for (WashingMachine machine : washingMachineInUse.keySet()) {
            if (washingMachineInUse.get(machine) && machine.getMaxWeight() >= weight) {
                return machine;
            }
        }

        return null;
    }
}
