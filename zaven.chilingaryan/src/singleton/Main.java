package singleton;

/**
 * Created by Zaven on 17.04.2017.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        CompareNumberGenerator compareNumberGenerator = new CompareNumberGenerator("generator");


        NumberGenerator numberGenerator1 = new NumberGenerator(compareNumberGenerator, "thread 1");
        NumberGenerator numberGenerator2 = new NumberGenerator(compareNumberGenerator, "thread 2");
        NumberGenerator numberGenerator3 = new NumberGenerator(compareNumberGenerator, "thread 3");
        compareNumberGenerator.getNumberGeneratorsList().add(numberGenerator1);
        compareNumberGenerator.getNumberGeneratorsList().add(numberGenerator2);
        compareNumberGenerator.getNumberGeneratorsList().add(numberGenerator3);


        Thread generatorTrade = new Thread(compareNumberGenerator);
        Thread thread1 = new Thread(numberGenerator1);
        Thread thread2 = new Thread(numberGenerator2);
        Thread thread3 = new Thread(numberGenerator3);

        thread1.start();
        thread2.start();
        thread3.start();

        Thread.sleep(1000);
        generatorTrade.start();


    }
}
