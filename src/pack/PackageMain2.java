package pack;

/*
이전코드와 같이 매번 패키지명 + 클래스명 다 쓰기 귀찮다
 import를 사용하면 다른 패키지의 클래스를 가져와서 사용할 수 있다.
 import를 사용한 덕분에 코드에서는 패키지명을 생략하고 클래스명만 적을 수 있다.
 */

//import pack.a.User;
import pack.a.*; //-> pack.a의 모든 클래스 사용

public class PackageMain2 {
    static void main(String[] args) {
        Data data = new Data(); //같은 pack패키지에 있으니 그냥 사용
        User user = new User(); //User는 다른 패키지에 있으므로 패키지명 + 클래스까지 풀네임
        User2 user2 = new User2();
    }
}
