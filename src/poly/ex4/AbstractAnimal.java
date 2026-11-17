package poly.ex4;

/*
앞서 ex3에서 move마저도 추상메서드로 만든다고 가정해보자.
순수추상클래스란 이렇게 클래스의 모든 메서드가 추상메서드인 클래스를 말한다. ---> 자바에선 인터페이스다 !
역시나 객체생성불가
모든 메서드 재정의 필요

class Animal {
public:
    virtual void sound() = 0;
    virtual void move() = 0;
    virtual ~Animal() {}   // 가상 소멸자
};
 */
public abstract class AbstractAnimal {
    public abstract void sound();
    public abstract void move();
    //자식클래스는 이제 sound, move 모두 메서드 오버라이딩 해야한다.
}
