package pack.b;

public class User {
    public User(){ //public생성자를 통해 다른 패키지에서 이 클래스의 생성자를 호출할 수 있도록
        System.out.println("패키지 pack.b User 생성");
    }
}
