package poly.ex3;

public class Dog extends AbstractAnimal {
    @Override
    public void sound() {//반드시 구현해야함
        System.out.println("멍멍");
    }
}
