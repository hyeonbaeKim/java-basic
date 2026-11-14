package extends1.ex3;

public class CarMain {
    static void main(String[] args) {
        ElectricCar eCar = new ElectricCar();
        eCar.charge();
        eCar.move();
        eCar.openDoor();

        GasCar gCar = new GasCar();
        gCar.move();
        gCar.fillUp();
        gCar.openDoor();

        HydrogenCar hCar = new HydrogenCar();
        hCar.move();
        hCar.fillHydrogen();
        hCar.openDoor();
    }
}
