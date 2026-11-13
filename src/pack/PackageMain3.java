package pack;

import pack.a.User;

public class PackageMain3 {
    static void main(String[] args) {
        User user = new User();
        pack.b.User user2 = new pack.b.User();

        /*
        서로 다른 패키지의 같은 이름의 클래스를 사용하고 싶다면 자주 사용하는 패키지의 클래스를 import하고
        나머지를 패키지를 포함한 전체경로를 써주면 된다.
        물론 둘 다 전체 경로를 사용한다면 import하지 않아도 된다.
         */
    }
}
