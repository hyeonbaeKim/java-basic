package constructor;

public class MemberInitMain5 {
    static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        //생성자를 만들지도 않았는데 파라미터가 없는 생성자를 호출하고 있음 -> 기본생성자

        /*
        파라미터가 하나라도 없는 생성자를 기본생성자라 한다.
        클래스에 생성자가 하나라도 있으면 자바 컴파일러는 파라미터가 하나도 없고 작동하는 코드가 없는
        기본생성자를 자동으로 만든다.
        생성자가 하나라도 있으면 자바는 기본생성자를 만들지 않는다.
         */

        /*
        MemberInit의 경우 생성자를 만들지 않았으므로 자바가 자동으로 기본 생성자를 만들어준것.

         */
    }
}
