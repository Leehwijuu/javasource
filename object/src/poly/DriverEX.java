package poly;

public class DriverEX {
    public static void main(String[] args) {
        Driver driver = new Driver();

        driver.drive(new Bus());
        driver.drive(new Taxi());
        driver.drive(new Vehicle());
    }
}
