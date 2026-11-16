package poly.ex1;

public class AnimalSoundMain2 {

    static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        soundDog(dog);
        soundCat(cat);
        soundCow(cow);
    }
    static void soundDog(Dog dog) {
        System.out.println("동물소리 테스트 시작");
        dog.sound();
        System.out.println("동물소리 테스트 종료");
    }
    static void soundCat(Cat cat) {
        System.out.println("동물소리 테스트 시작");
        cat.sound();
        System.out.println("동물소리 테스트 종료");
    }
    static void soundCow(Cow cow) {
        System.out.println("동물소리 테스트 시작");
        cow.sound();
        System.out.println("동물소리 테스트 종료");
    }
    /*
    중복을 없애고자 함수를 만들었지만 동물이 추가될 때마다 메서드를 계속 추가해야한다.
     */
}
