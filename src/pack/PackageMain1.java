package pack;

public class PackageMain1 {
    static void main(String[] args) {
        Data data = new Data(); //같은 pack패키지에 있으니 그냥 사용
        pack.a.User user = new pack.a.User(); //User는 다른 패키지에 있으므로 패키지명 + 클래스까지 풀네임
    }
}
