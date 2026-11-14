package extends1.access;

import extends1.access.child.Child;

public class ExtendsAccessMain {

    static void main(String[] args) {
        Child child = new Child();
        child.call(); //본인타입에서 찾기. 없으면 부모꺼 근데 여긴 본인타입에 call이 있음
        /*
        Child 클래스는 Parent의 접근지시자에 영향받아 코딩함
        외부 main은 일단 child객체에 접근할 때 public된 것에 접근
         */
    }
}
