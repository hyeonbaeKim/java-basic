package constructor;

public class MemberInit2 {
    String name;
    int age;
    int grade;

    void initMember(String name, int age, int grade){
        this.name = name; //this는 인스턴스 자기 자신을 가리킨다.
        this.age = age;
        this.grade = grade;
        /*
        지금처럼 파라미터와 멤버변수가 이름이 같을 땐 this를 꼭 명시해줘야하고
        파라미터와 멤버변수가 구별된다면 this는 필수가 아님
        근데 그냥 this를 반드시 강제하여 매개변수와 멤버변수를 눈에 보이도록 구분하는 회사도 있음.
        */
    }
}
