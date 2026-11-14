package extends1.ex2;

/*
extends Car를 통해 Car를 물려받아 move는 적을 필요가 없어짐
 */

public class ElectricCar extends Car {
    // ElectricCar -> Car

    public void charge(){
        System.out.println("주유합니다.");
    }

}
