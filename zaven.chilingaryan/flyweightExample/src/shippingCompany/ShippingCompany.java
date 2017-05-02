package shippingCompany;

import shippingCompany.trucks.*;

import java.util.HashMap;
import java.util.Map;

public class ShippingCompany {

    private static Map<TruckType, Truck> trucks = new HashMap<>();

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
        } else{
            throw new IllegalArgumentException("Weight must be less then or equal 5000");
        }
        switch (truckType) {
            case SMALL:
                truck = trucks.get(truckType);
                if (truck == null){
                    truck = new SmallTruck();
                    trucks.put(truckType,truck);
                }
                break;
            case MEDIUM:
                truck = trucks.get(truckType);
                if (truck == null){
                    truck = new MediumTruck();
                    trucks.put(truckType,truck);
                }
                break;
            case BIG:
                truck = trucks.get(truckType);
                if (truck == null){
                    truck = new BigTruck();
                    trucks.put(truckType,truck);
                }
                break;
            case EXTRA_BIG:
                truck = trucks.get(truckType);
                if (truck == null){
                    truck = new ExtraBigTruck();
                    trucks.put(truckType,truck);
                }
                break;


        }
        return truck;
    }

    enum TruckType {
        SMALL, MEDIUM, BIG, EXTRA_BIG
    }
}
