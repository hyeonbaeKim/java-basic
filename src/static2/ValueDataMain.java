package static2;

public class ValueDataMain {
    /*
    main메서드가 main인 이유
    1. main함수는 프로그램 시작시 부터 필요함.
    2. 객체 생성없이 main을 부름

    3. main메서드가 들어간 java파일에서 함수 생성시 static 선언한건 main이 static이라서.
     */
    static void main(String[] args) {
        DecoData data = new DecoData();
        sayHi();
    }

    static void sayHi(){
        System.out.println("say hi");
    }
}
