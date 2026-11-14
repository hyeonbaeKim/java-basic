package access.a;

public class PublicClass {
    static void main(String[] args) {
        PublicClass publicClass = new PublicClass(); //어디서든 사용가능
        DefaultClass1 defaultClass1 = new DefaultClass1(); //같은 패키지내에서 사용가능
        DefaultClass2 defaultClass2 = new DefaultClass2(); //같은 패키지내에서 사용가능
    }
}

class DefaultClass1{ //default 클래스
}

class DefaultClass2{ //default 클래스
}

//PublicClass.java파일안에 public클래스는 PublicClass.java파일과 이름이 같은 PublicClass 한개만
//default클래스들은 이 PublicClass.java 파일안에 무한정 만들 수 있다.
