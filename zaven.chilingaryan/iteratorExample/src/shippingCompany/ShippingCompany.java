package shippingCompany;

import shippingCompany.trucks.*;
import java.util.Iterator;

public class ShippingCompany {
    private static Garage garage = new Garage();

    public static Truck getTruck(double weight) {
        TruckType truckType;
        Truck truck = null;
        if (weight <= 800) {
            truckType = TruckType.SMALL;
        } else if (weight <= 1000) {
            truckType = TruckType.MEDIUM;
        } else if (weight <= 1500) {
            truckType = TruckType.BIG;
        } else if (weight <= 5000) {
            truckType = TruckType.EXTRA_BIG;
        } else {
            throw new IllegalArgumentException("Weight must be less then or equal 5000");
        }
        Iterator<Truck> iterator = garage.iterator();
        while (iterator.hasNext()) {
            Truck currentTruck = iterator.next();
            if (currentTruck.getTruckType() == truckType) {
                return currentTruck;
            }
        }
        switch (truckType) {
            case SMALL:
                truck = new SmallTruck();
                garage.add(truck);
                break;
            case MEDIUM:
                truck = new MediumTruck();
                garage.add(truck);
                break;
            case BIG:
                truck = new BigTruck();
                garage.add(truck);
                break;
            case EXTRA_BIG:
                truck = new ExtraBigTruck();
                garage.add(truck);
                break;
        }
        return truck;
    }


}
