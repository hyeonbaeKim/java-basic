package final1;

public class FinalLocalMain {
    static void main(String[] args) {
        //final 지역변수
        final int a = 1;   //최초 한번만 할당가능음 c++의 const도 마찬가지
        //a = 2; 컴파일에러

        method(10);
    }

    //final 매개변수
    static void method(final int a){
        //a = 4; 컴파일 에러 c++도 마찬가지
    }
}
