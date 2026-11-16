package extends1.super2;

/*
자바 규칙에는 상속관계의 클래스를 생성하면 자식클래스 생성자에서 부모클래스 생성자를 반드시 호출하는 규칙 : super()
자기클래스에서 복수개의 생성자있을 때 특정 생성자에서 자기의 다른 생성자 부르는 것은 : this()
 */
public class ClassB extends ClassA {

    public ClassB(int a) {
        super(); //매개변수 없는 기본생성자. (생략가능)
        System.out.println("Class B 생성자 a = " + a);
    }

    public ClassB(int a, int b) {
        super(); //매개변수 없는 기본생성자. (생략가능)
        System.out.println("Class B 생성자 a = " + a + ", b = " + b);
    }
}
