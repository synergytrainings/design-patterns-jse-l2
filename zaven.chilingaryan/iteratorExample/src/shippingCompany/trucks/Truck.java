package shippingCompany.trucks;
public interface Truck {
    TruckType getTruckType();
    String shipping(String address, double weight);
}
