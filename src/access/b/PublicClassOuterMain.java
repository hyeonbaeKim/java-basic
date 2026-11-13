package access.b;

//import access.a.DefaultClass1;
//import access.a.DefaultClass2;
import access.a.PublicClass;

public class PublicClassOuterMain {
    static void main(String[] args) {
        PublicClass publicClass = new PublicClass(); //어디서든 사용가능

        //다른패키지라 접근 불가능
        //DefaultClass1 defaultClass1 = new DefaultClass1(); //같은 패키지내에서 사용가능
        //DefaultClass2 defaultClass2 = new DefaultClass2(); //같은 패키지내에서 사용가능
    }
}
