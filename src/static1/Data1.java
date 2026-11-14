package static1;

public class Data1 {
    public String name;
    public int count;

    //생성자를 통해 객체가 생성될 때마다 인스터스의 내부변수인 count값을 증가시킨다.
    public Data1(String name) {
        this.name = name;
        count++;
    }
    /*
    인스턴스에 사용되는 멤버변수 count는 인스턴스끼리 서로 공유되지 않고 각 인스턴스가 갖는다.
     */
}
