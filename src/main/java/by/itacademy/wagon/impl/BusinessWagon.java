package by.itacademy.wagon.impl;

import by.itacademy.wagon.content.Passenger;

public class BusinessWagon extends AbstractWagon {

    public static final int PLACE_COUNT = 5;
    public static final double BAGGAGE_WEIGHT = 20;

    public BusinessWagon() {
        super(new Passenger[PLACE_COUNT]);
    }

    @Override
    public int getPassengerNumbers() {
        int passengerNumbers = 0;

        for (int i = 0; i < PLACE_COUNT; i++) {
            if (passengers[i] != null){
                passengerNumbers++;
            }
        }
        return passengerNumbers;
    }

    @Override
    public double getBaggageWeight() {
        return BAGGAGE_WEIGHT;
    }
}
