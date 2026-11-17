package poly.ex3;

/*
동물클래스같이 부모클래스의 역할은 제공하지만 실제 생성되면 안되는 클래스를 추상클래스라 한다.
추상메서드는 c++의 순수가상함수처럼 자식클래스가 반드시 오버라이딩 해야하는 함수임.
추상메서드가 1개라도 있는 클래스는 명시적으로 abstract라고 해야함

C++에서는 abstract 키워드가 없습니다.
추상 클래스는 **순수 가상 함수(pure virtual function)**가 하나라도 있으면 자동으로 추상 클래스가 됩니다.
함수 선언 뒤에 = 0을 붙이면 됩니다.

class Animal {
public:
    virtual void sound() = 0;   // 순수 가상 함수 → 이 클래스는 추상 클래스
    virtual ~Animal() {}        // 가상 소멸자 (권장)
};

class Dog : public Animal {
public:
    void sound() override {     // 구현하지 않으면 Dog도 추상 클래스가 됨
        std::cout << "멍멍" << std::endl;
    }
};
 */
public abstract class AbstractAnimal {
    public abstract void sound(); //추상메서드 (순수가상함수)는 바디가 없다.
    //반드시 오버라이딩 해야한다

    public void move(){ //추상메서드가 아니라 자식이 반드시 오버라이딩 하지 않아도 된다.
        //단순 상속 목적
        System.out.println("동물이 움직입니다.");
    }
}
