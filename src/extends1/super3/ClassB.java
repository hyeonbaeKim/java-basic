package extends1.super3;

/*
자바 규칙에는 상속관계의 클래스를 생성하면 자식클래스 생성자에서 부모클래스 생성자를 반드시 호출하는 규칙
 */
public class ClassB extends ClassA {

    public ClassB(int a) {
        this(10,20); //나의 다른생성자 호출해줘
        System.out.println("Class B 생성자 a = " + a);
    }

    public ClassB(int a, int b) {
        super(); //매개변수 없는 기본생성자. (생략가능) --> 하지만 결국 맨 마지막에 super()는 반드시 필요
        System.out.println("Class B 생성자 a = " + a + ", b = " + b);
    }
}
