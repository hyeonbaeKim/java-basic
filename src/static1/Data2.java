package static1;

public class Data2 {
    public String name;

    //생성자를 통해 객체가 생성될 때마다 인스터스의 내부변수인 count값을 증가시킨다.
    public Data2(String name, Counter counter) {
        this.name = name;
        counter.count++;
    }
}
