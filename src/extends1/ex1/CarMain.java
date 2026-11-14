package extends1.ex1;

public class CarMain {
    static void main(String[] args) {
        ElectricCar eCar = new ElectricCar();
        GasCar gCar = new GasCar();

        eCar.move();
        eCar.charge();

        gCar.move();
        gCar.fillUp();

        /*
        지금 보면 move()기능은 동일 -> 이럴 때 상속사용하면 효과적
         */
    }
}
