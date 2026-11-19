package poly.basic;

public class CastingMain1 {

    static void main(String[] args) {
        Parent poly = new Child(); //(부모와 자식 각각 따로 만들어진 객체)
        //poly.ChildMethod(); 컴파일 에러

        //다운캐스팅(부모타입에서 자식타입으로)으로 해결할 수 있다.
        Child child = (Child)poly; //자식은 부모를 담을 수 없으므로 형변환하고 별명 만든것.
        //1.Child child = poly -> poly가 참조하는 것을 child도 참조하는 것
        //2. Child child = (Child)poly; //해당 참조값을 꺼내고 꺼낸 참조값이 Child타입이 되는 것이다.
        child.childMethod();
        /*
        참고로 캐스팅을 한다고해서 Parent poly의 타입이 변하는 것은 아니다.
        *****해당 참조값을 꺼내고 꺼낸 참조값이 Child타입이 되는 것이다.
        Child child = (Child)poly;
        Child child = (Child)x001;
        Child child = x001;

        아니 근데 그냥 Child child = new Child(); 하면 되잖아!!
         */
    }
}
