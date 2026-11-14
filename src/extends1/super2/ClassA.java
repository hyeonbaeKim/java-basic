package extends1.super2;

/*
상속관계의 인스턴스를 생성하면 결국 메모리 내부에는 자식과 부모클래스가 각각 다 만들어진다.
Child를 만들면 부모인 Parent까지 함께 만들어지는 것이다. 따라서 각각의 생성자도 호출되어야 한다.
 */
public class ClassA {

    public ClassA() {
        System.out.println("Class A 생성자");
    }
}
