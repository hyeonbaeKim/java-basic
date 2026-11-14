package extends1.ex2;

/*
extends Car를 통해 Car를 물려받아 move는 적을 필요가 없어짐
 */

public class GasCar extends Car{
// GasCar -> Car
    public void fillUp(){
        System.out.println("기름을 주유합니다.");
    }
}
