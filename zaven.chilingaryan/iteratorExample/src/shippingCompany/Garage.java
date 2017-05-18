package shippingCompany;

import shippingCompany.trucks.Truck;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by zaven.chilingaryan on 5/18/2017.
 */
public class Garage {

    private Truck[] trucks;
    private int size;


    public Garage() {
        trucks = new Truck[4];
    }

    public Iterator<Truck> iterator(){
        return new TruckIterator();
    }

    public boolean add(Truck truck){
        if (size < trucks.length){
            trucks[size] = truck;
            size++;
            return true;
        }
        return false;
    }




    private class TruckIterator implements Iterator<Truck> {
        private int cursor = 0;

        @Override
        public boolean hasNext() {
            return cursor < size - 1;
        }

        @Override
        public Truck next() {
            if (cursor >= size) {
                throw new NoSuchElementException();
            }
            Truck current = trucks[cursor];
            cursor++;
            return current;
        }
    }


}
