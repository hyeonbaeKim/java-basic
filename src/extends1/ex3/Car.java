package extends1.ex3;

/*
모든 차량에 openDoor()기능을 추가해야 한다.
새로운 HybrogenCar를 추가해야한다.
HybrogenCar는 fillHydrogen() 기능을 통해 수소차를 충전할 수 있다.
*/
public class Car {

    public void move(){
        System.out.println("차를 이동합니다.");
    }

    /*
    모든 차량에 문열기 기능을 추가할 때는 상위부모인 Car에 openDoor()기능을 추가하면 된다.
    이렇게 하면 Car의 자식들은 해당 기능을 모두 물려받게 된다.
    만약 상속관계가 아니라면 각각의 차량에 해당 기능을 모두 추가해야 한다.
     */
    public void openDoor(){
        System.out.println("문을 엽니다.");
    }
}
