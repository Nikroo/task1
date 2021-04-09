package by.itacademy.train;

import by.itacademy.wagon.impl.BudgetWagon;
import by.itacademy.wagon.impl.BusinessWagon;
import by.itacademy.wagon.impl.ExtendedWagon;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class TrainTest {

    Train train;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before TrainTest.class");
    }

    @Before
    public void initTest() {
        train = new Train(Train.MAX_NUMBER_WAGON);
    }

    @Test
    public void testAdd() {
        assertTrue(train.add(new BudgetWagon()));
        assertTrue(train.add(new BusinessWagon()));
        assertTrue(train.add(new ExtendedWagon()));
    }

    public void testRemove() {
    }

    public void testGetWagons() {
    }

    public void testGetPassengerNumbers() {
    }

    public void testGetBaggageWeight() {
    }

    public void testSortByComfortLevel() {
    }

    public void testFindByPassengerRange() {
    }
}