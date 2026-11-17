package poly.ex4;

import poly.ex4.AbstractAnimal;

public class Cat extends AbstractAnimal {
    @Override
    public void sound() {//반드시 구현해야함
        System.out.println("냐옹");
    }

    @Override
    public void move() {
        System.out.println("고양이 이동");
    }
}
