package static1;
/*
특정 클래스에서 공용으로 사용할 수 있는 변수를 만들면 편리할 것이다.
static !

일반 멤버변수는 객체의 생성과 소멸에 생명주기를 같이 하지만
static 정적변수(클래스변수)는 프로그램이 시작되면서 붕어빵틀과 함께 생성되고 프로그램이 종료되며 붕어빵틀과함께 종료된다.
 */
public class Data3 {
    public String name; //객체 생길 때 각 객체가 멤버변수 각각 갖는다.
    public static int count; //static변수는 붕어빵틀에서 관리된다. 각 객체가 소유하는것 아님.
    //즉 객체가 3개 만들어지면 각 객체가 name변수를 갖고(총 3개의 객체와 3개의 name) 붕어빵틀1개는 count변수 1개를 갖음

    public Data3(String name) {
        this.name = name;
        count++; //Data1과의 차이는 static count가 ++되는
        //Data3.count++; 도 맞다.
    }
}
