package singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Zaven on 17.04.2017.
 */
public class NumberGenerator implements Runnable {

    private String treadeName;
    private CompareNumberGenerator compareNumberGenerator;
    private boolean isCheckedNumber = false;
    private volatile boolean isRun = true;
    private List<Integer> list = new ArrayList<Integer>();
    private Random random = new Random();

    public NumberGenerator(CompareNumberGenerator compareNumberGenerator, String threadName) {
        this.treadeName = threadName;
        this.compareNumberGenerator = compareNumberGenerator;
    }

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public boolean isRun() {
        return isRun;
    }

    public void setRun(boolean run) {
        isRun = run;
    }

    private void numbersGenerator() {
        while (list.size() < 22) {
            Integer number = random.nextInt(99) + 1;

            list.add(number);

        }
    }

    @Override
    public void run() {
        numbersGenerator();
        while (this.isRun) {
            if (isCheckedNumber) {
                compareNumberGenerator.checkEmptyList(list);
                this.isCheckedNumber = false;
            }
        }
    }


    public void checkNumber(Integer number) {

        while (this.list.contains(number)) {
            this.list.remove(number);
            this.isCheckedNumber = true;

            Printer printer = Printer.getInstance();
            System.out.print("size ");
            printer.print(this.list.size(), treadeName);
            System.out.print("check number");
            printer.print(number, treadeName);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NumberGenerator that = (NumberGenerator) o;

        return list != null ? list.equals(that.list) : that.list == null;

    }


}
