package constructor;

public class MemberInitMain6 {
    static void main(String[] args) {
        //생성자도 메서드 오버로딩처럼 매개변수만 다르게 해서 여러 생성자를 제공할 수 있다.
        MemberConstruct member1 = new MemberConstruct("kim",32,100);
        MemberConstruct member2 = new MemberConstruct("LeeChangMin",34);
        //member2의 grade는 67로 생성된다.

        /*
        생성자를 오버로딩 한 덕분에 성적입력이 꼭 필요한 경우에는 grade가 있는 생성자를 호출하면 되고
        그렇지 않은 경우에는 grade가 없는 생성자를 호출하면 된다.
         */
    }
}
