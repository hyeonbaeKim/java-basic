package static2;

public class DecoMain1 {
    static void main(String[] args) {
        String s = "Hello Java";

        DecoUtil1 utils = new DecoUtil1();
        String deco = utils.Deco(s);

        System.out.println("before : " + s);
        System.out.println("after :  " + deco );
        deco = "";

        DecoUtil1 utils2 = new DecoUtil1();
        deco = utils2.Deco(s);

        System.out.println("before : " + s);
        System.out.println("after :  " + deco );
        /*
        앞서 개발한 deco메서드를 호출하기 위해서는 DecoUtil1의 인스턴스를 먼저 생성해야한다.
        그런데 deco()는 멤버변수도 없고 단순히 기능제공만 할 뿐이다.
        인스턴스를 사용하는 목적은 멤버변수를 사용하는 목적이 큰데 이 메서드는 사용하는 멤버변수없이
        단순 기능 제공만 한다.
        객체를 몇개를 생성한다해도 의미없어보인다..
         */
    }
}
