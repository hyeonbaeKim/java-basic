package extends1.ex2;

public class CarMain {
    static void main(String[] args) {
        ElectricCar eCar = new ElectricCar();
        /*
        eCar가 갖는 참조값은 x001하나지만 실제로 그 안에서는 Car와 ElectricCar라는 두가지 클래스가 공존
        상속이라해서 단순히 부모의 필드와 메서드만 물려받는게 아니라 부모의 클래스도 함께 포함해서 생성된다.
        외부에서 볼 때는 하나의 인스턴스(ElectricCar)가 생성되는 것 같지만 내부에는 ElectricCar와 Car가 공존
         */

        eCar.charge();
        /*
        x001.move()가 되어 x001에서 이제 ElectricCar로 부터 charge? Car로부터 charge? 선택해야하는데
        이때는 호출하는 타입을 기준으로 선택한다. 그래서 여기는 ElectricCar의 charge()
        */

        eCar.move();
        /*
        x001.move()가 되어 x001에서 이제 ElectricCar로 부터 move? Car로부터 move? 선택해야하는데
        이때는 호출하는 타입을 기준으로 선택한다. 그래서 여기는 ElectricCar의 move()을 찾는다.
        그런데 이 경우 move()가 없다. 상속관계에서는 자식타입에 해당기능이 없으면 부모타입으로 올라가서 찾는다.
        부모인 Car에 move()가 있으므로 부모에 있는 move()를 호출한다.
        만약 부모에서도 해당 기능을 찾지 못하면 더 상위 부모에서 필요한 기능을 찾아본다. 부모에 부모 계속 올라가면서
        필드나 메서드를 찾는 것이다. 물론 계속 찾아도 없으면 컴파일 오류가 발생한다.
        */

        GasCar gCar = new GasCar();
        //GasCar뿐만 아니라 상속관계에 있는 Car까지 함께 포함해서 인스턴스 생성
        gCar.move();
        gCar.fillUp();
    }
    /*
    자식클래스는 부모클래스의 기능을 물려받아서 접근해서 사용하지만 그 반대는 아님
     */
}
