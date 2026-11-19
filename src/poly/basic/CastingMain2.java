package poly.basic;

public class CastingMain2 {
    static void main(String[] args) {
        Parent poly = new Child(); //(부모와 자식 각각 따로 만들어진 객체)
        //poly.ChildMethod(); 컴파일 에러

        //다운캐스팅(부모타입에서 자식타입으로)으로 해결할 수 있다.
        Child child = (Child)poly; //자식은 부모를 담을 수 없으므로 형변환

        //일시적 다운캐스팅 (별명 만들어주지 않고 그냥 일시적으로 사용하는 것)
        ((Child) poly).childMethod(); //Parent만 읽을 수 있던 Child객체를 Parent+Child타입 다 읽게하는것
        //연산자 우선순위가 . 가 우선이라 또 () 해준것. ****

        // 아니 근데 그냥 Child child = new Child(); 하면 되잖아!!
    }
}
