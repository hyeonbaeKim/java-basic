package constructor;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age, int grade){ //생성자는 반환타입이 없다 !!!!!!!!!!!!
        this.name = name; //this는 현재 객체를 참조한다. 현재객체는 멤버변수들을 갖는다.
        this.age = age;
        this.grade = grade;
    }


    //생성자 메서드 오버로딩
    MemberConstruct(String name, int age){
        this.name = name;
        this.age = age;
        this.grade = 67;
    }
}
