package extends1.overriding;

public class ElectricCar extends Car {
    // ElectricCar -> Car

    @Override //조건이 만족해야 노란불 켜진다.
    /*
    조건1. 메서드 이름과 파라미터가 동일해야한다.
    조건2. 반환 타입이 동일해야 한다.
    조건3. 자식클래스 오버라이딩 메서드는 부모클래스 메서드보다 더 제한적이여서는 안된다.
        오버라이딩되면 최소 같거나 더 public되야함
    조건4. 생성자는 오버라이딩 안됌
    조건5.
        private는 해당 클래스에서만 접근하기 때문에 오버라이딩될 수 없다
        static은 클래스 레벨에서 작동하므로 오버라이딩(객체 상속)될 수 없다.
        final메서드는 재정의를 금지한다.
     */
    public void move(){
        System.out.println("전기차를 빠르게 이동합니다.");
    }

    public void charge(){
        System.out.println("주유합니다.");
    }

}
