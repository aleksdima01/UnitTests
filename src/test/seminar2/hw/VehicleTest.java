package seminar2.hw;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    Car car;
    Motorcycle moto;

    @BeforeEach
    void setUp() {
        car = new Car("Dodge", "Ram", 2010);
        moto = new Motorcycle("Harley-davidson", "Sportster", 2023);
    }

    /**
     * Проверить, что экземпляр объекта Car также является
     * экземпляром транспортного средства (используя оператор instanceof).
     */
    @Test
    public void testCarIsInstanceOfVehicle() {
        assertTrue(car instanceof Vehicle);
    }

    /**
     * Проверить, что объект Car создается с 4-мя колесами.
     */
    @Test
    public void testCarIsFourWheels() {
        assertEquals(4, car.getNumWheels());
    }

    /**
     * Проверить, что объект Motorcycle создается с 2-мя колесами
     */
    @Test
    public void testMotoIsDoubleWheels() {
        assertEquals(2, moto.getNumWheels());
    }

    /**
     * Проверить, что объект Car развивает скорость 60
     * в режиме тестового вождения (используя метод testDrive()).
     */
    @Test
    public void testCarTestDrive() {
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    /**
     * Проверить, что объект Motorcycle развивает
     * скорость 75 в режиме тестового вождения (используя метод testDrive()).
     */
    @Test
    public void testMotoTestDrive() {
        moto.testDrive();
        assertEquals(75, moto.getSpeed());
    }

    /**
     * Проверить, что в режиме парковки (сначала testDrive, потом park,
     * т.е. эмуляция движения транспорта) машина останавливается (speed = 0).
     */
    @Test
    public void testCarTestDriveAndStop() {
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    /**
     * Проверить, что в режиме парковки (сначала testDrive, потом park,
     * т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0).
     */
    @Test
    public void testMotoTestDriveAndStop() {
        moto.testDrive();
        moto.park();
        assertEquals(0, moto.getSpeed());
    }

}


