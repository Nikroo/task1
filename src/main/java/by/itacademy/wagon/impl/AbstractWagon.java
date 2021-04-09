package by.itacademy.wagon.impl;

import by.itacademy.wagon.content.Passenger;
import by.itacademy.wagon.interf.Wagon;

public abstract class AbstractWagon implements Wagon {

    Passenger[] passengers;

    AbstractWagon(Passenger[] passengers) {
        this.passengers = passengers;
    }

    public Passenger[] getPassenger() {
        return passengers;
    }

    public boolean addPassenger(Passenger passenger) {
        for (int i = 0; i < passengers.length; i++) {
            if (passengers[i] == null) {
                passengers[i] = passenger;
                break;
            }
        }
        return true;
    }

    public Passenger removePassenger(Passenger passenger) {
        return passenger;
    }
}
