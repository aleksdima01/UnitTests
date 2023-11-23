package seminar2.hw_test;

import org.junit.jupiter.api.*;
import Seminar2.hw.*;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    Car car;

    @BeforeEach
    void setUp() {
        Car car = new Car("Dodge", "Ram", 2010);
    }


    @Test
    public void testCarIsInstanceOfVehicle() {
        assertTrue(car instanceof Vehicle);
    }


}