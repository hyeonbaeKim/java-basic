package oop1;

public class ValueObject {
    int value;

    void add(){ // <- 중요한 것은 static을 사용하지 않는다. 메서드는 객체가 생성되야 호출할 수 있어서.
        value++;
    }

    /*
    객체는 자신의 메서드를 통해 자신의 멤버변수에 접근할 수 있다.
    객체의 메서드 내부에서 접근하는 멤버변수는 객체 자신의 멤버변수이다.
     */
}
