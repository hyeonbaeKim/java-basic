package final1;

public class FinalFieldMain {
    static void main(String[] args) {

        //final변수 생성자로 초기화
        ConstructInit constructInit1 = new ConstructInit(10);
        ConstructInit constructInit2= new ConstructInit(20);
        System.out.println("constructInit1.value = " + constructInit1.value);
        System.out.println("constructInit2.value = " + constructInit2.value );

        //final변수 필드 초기화
        FieldInit fieldInit1 = new FieldInit(10);
        FieldInit fieldInit2 = new FieldInit(10);
        FieldInit fieldInit3 = new FieldInit(10);
        System.out.println("fieldInit1.value = " + fieldInit1.value);
        System.out.println("fieldInit2.value = " + fieldInit2.value);
        System.out.println("fieldInit3.value = " + fieldInit3.value);

        //상수
        System.out.println("상수");
        System.out.println(FieldInit.CONST_VALUE);

        /*
        final키워드를 생성자로 초기화한 경우엔 지금 2개의 인스턴스가 각각 다른 final value를 갖는데
        필드 초기화로 3개의 인스턴스를 만든 경우에는 지금 3개의 인스턴스가 똑같은 final value를 갖는다. -> 왜 3개 만든거야?
        이럴때 사용하면 좋은것이 static final 키워드. 그냥 붕어빵틀에 1개 박아놓는것.
        이런 이유로 final + 필드 초기화하는경우 메모리 낭비로 인해 static final로 사용하는 것이 효과적이다.
         */
    }
}
