package shippingCompany.trucks;

public class ExtraBigTruck implements Truck {

    private static final double CARRYING_CAPACITY = 5000;

    @Override
    public String shipping(String address, double weight) {
        if (weight > CARRYING_CAPACITY) {
            System.out.println("Weight your buggage is greater than truck carrying capacity, you can use a bigger truck");
        }

        return "Your baggage arrived to " + address;
    }
}
