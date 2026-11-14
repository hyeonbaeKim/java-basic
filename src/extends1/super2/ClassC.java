package extends1.super2;

public class ClassC extends ClassB{

    public ClassC(){
        super(10,20);
        System.out.println("Class C 생성자");
    }

    public ClassC(int a) {
        //super(); 불가능. ClassB는 매개변수 있는 생성자를 직접 정의함.
        super(a);
    }

    public ClassC(int a, int b) {
        super(a, b);
    }
}
