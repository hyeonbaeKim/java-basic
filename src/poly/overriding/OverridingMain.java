package poly.overriding;

public class OverridingMain {

    static void main(String[] args) {
        //자식 변수가 자식 인스턴스 참조
        Child child = new Child(); //(부모와 자식 각각 따로 만들어진 객체에서 자식부분 찾는다.)
        System.out.println("Value = " + child.value); //Child
        child.method(); //Child.method()

        //부모변수가 부모 인스턴스 참조
        Parent parent = new Parent(); //부모만 만들어진 객체에 부모부분 찾는다.
        System.out.println("Value = " + parent.value); //Parent
        parent.method(); //parent.method()
        //method()자체는 오버라이딩 됬어도 객체 자체에 C hild가 없음

        //다형적 참조 (부모는 자식을 넓은 아량으로 담을 수 있다.)
        Parent poly = new Child(); //(부모와 자식 각각 따로 만들어진 객체에서 부모부분 찾는다.)
        System.out.println("Value = " + poly.value); //Parent (변수는 오버라이딩이 안된다!!!!!!!!!!!!!!!!!!!)
        poly.method(); //parent.method()가 아니라 Child.method !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        //Parent타입의 method()를 실행하려는데 오버라이딩된 메서드는 항상 우선권을 갖기 때문에 Child의 method()가 실행된 것.
        /*
        Child child = new Child();
        child.method(); 이것도 원래 child.method()실행되는것도 맞고
        오버라이딩된 메서드라서 우선권도 갖기도함
         */

        /*
        자바의 메서드 오버라이딩은 c++의 가상함수와 완전히 같다.
        c++은 메서드 오버라이딩을 해도 virtual키워드를 붙여줘야하고 그렇지 않으면 그냥 숨기기 된다.
        ex)
        class Base{
            public:
                void show(){}
        }

        class Derived : public Base{
            public:
                void show(){} //virtual void show(){} 아님
        }
        Base *b = new Derived();
        b->show(); //Base의 show출력
         */
    }
}
