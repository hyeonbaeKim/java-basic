package ref;

public class NullMain1 {
    static void main(String[] args) {
        /*
        참조변수 선언하면 (자료형이 대문자) 가리킬 놈이 있어야 하는데, 아직 가리킬 놈 없을때 null 사용
        또 가르키는 대상을 나중에 입력하고 싶을 때 null 사용
         */
        Data data = null;
        data = new Data();
        data = null;

        //자바는 이렇게 참조되지 않는 인스턴스를 JVM의 가비지컬렉션이 자동으로 스스로 제거해준다.
    }
}
