package by.itacademy.train;

import by.itacademy.wagon.impl.AbstractWagon;
import by.itacademy.wagon.interf.Wagon;
import by.itacademy.exception.Exception;

public class Train {

    private int id;
    private AbstractWagon[] wagons;

    public static final int MIN_NUMBER_WAGON = 0;
    public static final int MAX_NUMBER_WAGON = 5;

    public Train(int count) {
        if (count > MIN_NUMBER_WAGON && count <= MAX_NUMBER_WAGON) {
            wagons = new AbstractWagon[count];
        } else {
            Exception.getMessage("Wrong numbers of wagon!");
        }
    }

    public boolean add(AbstractWagon wagon) {
        for (int i = 0; i < wagons.length; i++) {
            if (wagons[i] == null) {
                wagons[i] = wagon;
                return true;
            }
        }
        Exception.getMessage("The train is overloaded!");
        return false;
    }

    public void remove(AbstractWagon wagon) {
    }

    public AbstractWagon[] getWagons() {
        return wagons;
    }

    public int getPassengerNumbers() {
        int count = 0;
        for (Wagon wagon : wagons) {
            count += wagon.getPassengerNumbers();
        }
        return count;
    }

    public double getBaggageWeight() {
        double sum = 0;
        for (Wagon wagon : wagons) {
            sum += wagon.getBaggageWeight();
        }
        return sum;
    }

    public Wagon[] sortByComfortLevel() {
        return wagons;
    }

    public Wagon[] findByPassengerRange() {
        return wagons;
    }

}
