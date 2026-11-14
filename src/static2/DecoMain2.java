package static2;

public class DecoMain2 {

    static void main(String[] args) {
        String s = "Hello Java";
        String deco = DecoUtil2.Deco(s);

        System.out.println("before : " + s);
        System.out.println("after : " + deco);

        deco = "";
        deco = DecoUtil2.Deco(s);
        System.out.println("before : " + s);
        System.out.println("after : " + deco);

        //정적메서드 덕분에 불필요한 객체 생성없이 편리하게 메서드를 사용했다.
        /*
        정적메서드는 객체생성이 필요없이 메서드의 호출만으로 필요한 기능을 수행할 때 주로 사용된다.
         */
    }

}
