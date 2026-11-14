package extends1.overriding;

public class CarMain {
    static void main(String[] args) {
        ElectricCar eCar = new ElectricCar();
        eCar.move(); //여기는 ElectricCar에 move가 재정의되어있으므로 ElectricCar의 move가 실행된다.
        eCar.openDoor();

        GasCar gCar = new GasCar();
        gCar.move();
        gCar.openDoor();
    }
}
