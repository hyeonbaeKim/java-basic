package oop1;

public class ValueDataMain {
    static void main(String[] args) {
        ValueData valueData = new ValueData();
        add(valueData);
        add(valueData);
        add(valueData);

        /*
        valueData라는 객체를 생성하고 외부에서 valueData.value에 접근해 숫자를 증가시키는 단순한 코드
        데이터인 value와 메서드인 add가 서로 분리되어있다.

        하지만 자바같은 객체지향언어는 클래스 내부에 데이터와 기능을 함께 포함시킬 수 있다.
        */
    }
    static void add(ValueData valueData){
        valueData.value++;
    }
}
