package by.itacademy;

import by.itacademy.wagon.content.Baggage;
import by.itacademy.wagon.content.Passenger;
import by.itacademy.wagon.impl.AbstractWagon;
import by.itacademy.wagon.impl.BudgetWagon;
import by.itacademy.wagon.impl.BusinessWagon;
import by.itacademy.wagon.impl.ExtendedWagon;
import by.itacademy.train.Train;

import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {

        Passenger passenger0 = new Passenger("Ivan", "Ivanov", 0, new Baggage());
        Passenger passenger1 = new Passenger("Olga", "Ivanova", 1, new Baggage());
        Passenger passenger2 = new Passenger("Sergei", "Sergeev", 2, new Baggage());
        Passenger passenger3 = new Passenger("Vladimir", "Ivanov", 3, new Baggage());
        Passenger passenger4 = new Passenger("Dmitri", "Dmitriev", 4, new Baggage());
        Passenger passenger5 = new Passenger("Grigory", "Potter", 5, new Baggage());

        AbstractWagon wagon = new BusinessWagon();

        wagon.addPassenger(passenger0);
        wagon.addPassenger(passenger1);
        wagon.addPassenger(passenger2);
        wagon.addPassenger(passenger3);
        wagon.addPassenger(passenger4);
        wagon.addPassenger(passenger5);

        AbstractWagon wagon1 = new BudgetWagon();
        AbstractWagon wagon2 = new ExtendedWagon();

        Train train = new Train(1);
        train.add(wagon);
        //train.add(wagon1);
        //train.add(wagon2);

        System.out.println(Arrays.toString(wagon.getPassenger()));

        System.out.println(train.getPassengerNumbers());
        System.out.println(train.getBaggageWeight());

    }


}
