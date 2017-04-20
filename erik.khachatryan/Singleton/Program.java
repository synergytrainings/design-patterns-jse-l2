import java.util.*;

class Program {
    public static void main(String[] args) throws InterruptedException {
        //Now it works fine, and th count of objects will be 1, but if you made getInstance() method unsynchronized
        // and run the code couple of times, the count of objects that will be created will be 2...
        Thread thread1 = new Thread(()->{
            SingletonCar car1 = SingletonCar.getInstance();
        });
        Thread thread2 = new Thread(()->{
            SingletonCar car2 = SingletonCar.getInstance();
        });

        thread1.start();
        thread2.start();

        Thread.sleep(100);
        System.out.println("Count of objects that was created during program execution: " + SingletonCar.getCountOfObjects());

        //a sample example of using Singleton classes
        Scanner input = new Scanner(System.in);
        String exit = "";
        do{
            System.out.println("What is your name?");
            SingletonCar.getInstance().getRider().setName(input.nextLine());
            System.out.println("Hello " + SingletonCar.getInstance().getRider().getName() + "\nHow old are you? (example 20)");
            SingletonCar.getInstance().getRider().setAge(input.nextInt());
            System.out.println("What is your car mark?");
            SingletonCar.getInstance().setMark(input.nextLine());
            System.out.println("And what model of " + SingletonCar.getInstance().getMark() +  " is it?");
            SingletonCar.getInstance().setModel(input.nextLine());
            String number = "";
            do {
                if(number.equals("")) {
                    System.out.println("And the last thing.\nPlease input your " + SingletonCar.getInstance().getMark() + " " + SingletonCar.getInstance().getModel() + " number.(example 00oo000)");
                }else {
                    System.out.println("Wrong number, try again...");
                }
                number = input.nextLine();
            }while (!SingletonCar.getInstance().setNumber(number));
            System.out.println("So if I get right " + SingletonCar.getInstance());
            System.out.println("If everything is ok insert [OK] or anything else to input all again");
            exit = input.next();
        }while (!exit.toLowerCase().equals("ok"));
    }
}