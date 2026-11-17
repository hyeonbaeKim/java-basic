package poly.ex4;

import poly.ex4.AbstractAnimal;

public class AbstractMain {
    static void main(String[] args) {
        //AbstractAnimal abstractAnimal = new AbstractAnimal(); 추상클래스는 객체생성 할 수 없음

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        cat.sound(); //냐옹
        cat.move(); //동물이 움직입니다.

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);

        moveAnimal(dog);
        moveAnimal(cat);
        moveAnimal(cow);
    }
    static void soundAnimal(AbstractAnimal animal){
        System.out.println("동물 울음 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 울음 소리 테스트 종료");
    }

    static void moveAnimal(AbstractAnimal animal){
        System.out.println("동물 이동 시작");
        animal.move();
        System.out.println("동물 이동 종료");
    }
}
