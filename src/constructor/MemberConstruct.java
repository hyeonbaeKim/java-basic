package constructor;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age, int grade){ //생성자는 반환타입이 없다 !!!!!!!!!!!!
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    //추가
    //생성자도 메서드 오버로딩처럼 매개변수만 다르게 해서 여러 생성자를 제공할 수 있다.
    MemberConstruct(String name, int age){
        this.name = name;
        this.age = age;
        this.grade = 67;
    }
}
