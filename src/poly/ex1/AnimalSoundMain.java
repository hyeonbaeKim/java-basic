package poly.ex1;

public class AnimalSoundMain {

    static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        System.out.println("동물소리 테스트 시작");
        dog.sound(); //멍멍
        System.out.println("동물소리 테스트 종료");

        System.out.println("동물소리 테스트 시작");
        cat.sound(); //냐옹
        System.out.println("동물소리 테스트 종료");

        System.out.println("동물소리 테스트 시작");
        cow.sound(); //음매
        System.out.println("동물소리 테스트 종료");

        //만약 여기서 까마귀가 추가된다면? 까마귀 클래스를 또 만들고 여기서 객체생성하고 울음소리 내줘야함
        /*
        System.out.println("동물소리 테스트 시작");
        객체.sound();
        System.out.println("동물소리 테스트 종료"); 그리고 이 부분이 중복임.
        중복을 제거하기 위해서는 메서드를 사용하거나, 배열, for문이 필요. 근데 클래스가 서로 완전히 다름
         */
    }
}
