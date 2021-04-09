package by.itacademy.wagon.impl;

import by.itacademy.wagon.content.Passenger;

public class ExtendedWagon extends AbstractWagon {

    public static final int PLACE_COUNT = 30;
    public static final double BAGGAGE_WEIGHT = 30;

    public ExtendedWagon() {
        super(new Passenger[PLACE_COUNT]);
    }

    @Override
    public int getPassengerNumbers() {
        return PLACE_COUNT;
    }

    @Override
    public double getBaggageWeight() {
        return BAGGAGE_WEIGHT;
    }
}
