package singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Zaven on 17.04.2017.
 */
public class CompareNumberGenerator implements Runnable {
    private Printer printer;
    private List<Integer> list = new ArrayList<>();
    private Random random = new Random();
    private List<NumberGenerator> numberGeneratorsList = new ArrayList<>();
    private boolean isRun = true;
    private String threadName;


    public CompareNumberGenerator(String threadName) {
        this.threadName = threadName;
    }

    public List<NumberGenerator> getNumberGeneratorsList() {
        return numberGeneratorsList;
    }

    public void setNumberGeneratorsList(List<NumberGenerator> numberGeneratorsList) {
        this.numberGeneratorsList = numberGeneratorsList;
    }

    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }

    public boolean isRun() {
        return isRun;
    }

    public void setRun(boolean run) {
        isRun = run;
    }

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    private void numberGenerator() {
        Integer number = random.nextInt(99) + 1;
        list.add(number);
        for (NumberGenerator numberGenerator : numberGeneratorsList) {
            numberGenerator.checkNumber(number);
        }

        printer = Printer.getInstance();
        printer.printList(list, threadName);


    }


    public void checkEmptyList(List<Integer> list) {
        if (list.isEmpty()) {
            isRun = false;
            for (NumberGenerator numberGenerator : numberGeneratorsList) {
                numberGenerator.setRun(false);

            }

        }
    }

    @Override
    public void run() {

        numberGenerator();

        while (isRun) {
            numberGenerator();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        ;

        printer.printList(list, threadName);
    }
}
