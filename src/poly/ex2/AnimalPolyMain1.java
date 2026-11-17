package poly.ex2;

public class AnimalPolyMain1 {
    static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);
    }

    /*
    다형성 덕분에 이후에 동물을 추가해도 가령 elepant, 이후에 soundAnimal함수를 재활용할 수 있다.
    물론 다형성을 사용하기 위해 새로운 동물은 Animal을 상속받아야한다.
     */
    private static void soundAnimal(Animal animal) { //부모는 자식을 담을 수 있다.
        System.out.println("동물 울음 테스트 시작");
        animal.sound();
        System.out.println("동물 울음 테스트 종료");
    }
}
