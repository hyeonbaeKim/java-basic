package access.b;

import access.a.AccessData;

public class AcessOuterMain {
    static void main(String[] args) {
        AccessData data = new AccessData();

        //public은 어디에서나 호출 가능
        data.publicField = 1;
        data.publicMethod(); //1

        //AccessData가 다른 패키지라 default 호출 불가능
        //data.defaultField = 2;
        //data.defaultMethod();

        //private는 외부에서 호출 절대 불가. 자기 클래스 내부에서만 사용 가능. (AccessData내부에서만 사용가능)
        //data.privateField = 3;
        //data.privateMethod();

        data.innerAccess(); //innerAccess는 public이라 호출가능. innerAccess내부에서는 private호출가능
    }
}
