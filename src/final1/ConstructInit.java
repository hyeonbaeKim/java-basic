package final1;

public class ConstructInit {

    final int value;

    public ConstructInit(int value) {
        this.value = value; //final이라 생성자에서 값을 할당해주고 더 이상 값을 바꿀 수 없음
        //c++은 final(const)멤버변수를 초기화리스트로 한 번 값을 주고, 더 이상 바꿀 수 없음
    }
}
