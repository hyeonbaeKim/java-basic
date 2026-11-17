package poly.ex4;

import poly.ex4.AbstractAnimal;

public class Cow extends AbstractAnimal {
    @Override
    public void sound() {//반드시 구현해야함
        System.out.println("음메");
    }

    @Override
    public void move() {
        System.out.println("소 이동");
    }
}
