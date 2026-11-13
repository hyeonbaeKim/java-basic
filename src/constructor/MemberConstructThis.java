package constructor;

public class MemberConstructThis {
    String name;
    int age;
    int grade;

    /*MemberConstruct생성자 만들 때
    this.name = name;
    this.age = age; 부분이 중복됬다.
    이때 this()라는 기능을 사용하면 생성자 내부에서 자신의 생성자를 호출 할 수 있다.
     */

    MemberConstructThis(String name, int age){
        this(name,age,67);
        /*
        이 코드는 첫번째 생성자 내부에서 두번째 생성자를 호출한다.
        this()는 생성자 코드의 첫 줄에만 작성할 수 있다. (규칙임)
         */
    }

    MemberConstructThis(String name, int age, int grade){ //생성자는 반환타입이 없다 !!!!!!!!!!!!
        this.name = name;
        this.age = age;
        this.grade = grade;
    }


}
