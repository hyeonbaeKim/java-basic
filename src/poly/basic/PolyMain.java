package poly.basic;

/*
int a = 5; 5를 바로 a에 담는것.
new Child();는 메모리의 주소(참조값)
그 주소을 이용하려고 Child child = new Child();
child. ~로 접근

~ = a; 아 값이 복사됬구나
~ = child; = 아 주소가 복사됬구나

상속된 객체 만들어지면 메모리상에 부모는위에 자식은 아래로 생각하고
Child child = new Child();는 (부모와 자식 각각 따로 만들어진 객체로 가서)자식을 찾는다.
이렇게 생각하자 Child객체가 만들어지고 Parent+Child 메모리가 있는데 그 별명이 child이고 Parent+Child읽는것
Parent poly = new Child();는 (부모와 자식 각각 따로 만들어진 객체로 가서)부모를 찾는다.
이렇게 생각하자 Child객체가 만들어지고 Parent+Child 메모리가 있는데 그  별명이 parent이고 Parent만 읽는것

상속관계는 부모방향으로 찾아 올라갈 순 있지만 자식방향으로 찾아 내려갈 순 없다.
왜냐면 Parent는 Parent만 알지만 Child는 extends Parent로 Child와 Parent다 안다.
 */
public class PolyMain {

    static void main(String[] args) {
        //부모변수가 부모인스턴스 참조
        Parent parent = new Parent();
        parent.parentMethod(); //Parent만 생성되고 (Child는 있는지도 모름)Parent의 ParentMethod()

        //자식변수가 자식인스턴스 참조
        Child child = new Child(); //이 경우 Child는 상속받았기에 메모리상에 Parent + Child 인스턴스가 생성된다.
        //childMethod를 갖는 Child와 parentMethod를 갖는 Parent가 같이 존재 (이 경우 Child는 Parent를 안다.)
        child.parentMethod(); // (부모와 자식 각각 따로 만들어진 객체로 가서)자식에서 parentMethod찾는다. 어 없네? 부모로 가서 찾는다.
        child.childMethod(); // (부모와 자식 각각 따로 만들어진 객체로 가서)자식을 찾는다.

        //부모변수가 자식인스턴스 참조 (부모는 맘이 넓어서 자식을 담을 수 있다 ㅋㅋㅋㅋ)
        Parent poly = new Child(); //Child인스턴스를 만들었다. 이 경우 Child + Parent 모두 생성된다.
        poly.parentMethod(); //(부모와 자식 각각 따로 만들어진 객체로 가서)부모를 찾는다.

        //poly.childMethod(); (부모와 자식 각각 따로 만들어진 객체로 가서)부모을 찾는다.
        //poly는 Parent타입이라 Parent클래스부터 시작해서 필요한 기능을 찾는다.
        //그런데 상속관계는 부모방향으로 찾아 올라갈 순 있지만 자식방향으로 찾아 내려갈 순 없다.
        //따라서 childMethod()를 찾을 수 없으므로 컴파일 실패
        /*
        이런경우 childMethod()를 호출하고 싶으면? 캐스팅이 필요하다!
        아니 이거 불편한거 같은데 그냥 Child child = new Child();해서 밑에서 위로 찾게끔하면 되는거아냐?
        다형성 왜 쓰는거야!!
         */

        //반대로 자식변수가 부모인스턴스 참조 금지
        //Child child = new Parent();
    }
}
