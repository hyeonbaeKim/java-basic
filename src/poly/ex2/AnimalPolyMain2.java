package poly.ex2;

public class AnimalPolyMain2 {
    static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        Animal[] animalArr = {dog, cat, cow}; //다형성을 통해 배열에 담을 수 있게 되었다!

        Animal[] animalArr2 = new Animal[3];
        animalArr2[0] = dog;
        animalArr2[1] = cat;
        animalArr2[2] = cow;

        Animal[] animalArr3 = new Animal[] {dog,cat,cow};

        //Duck같은 동물이 추가되도 변하지 않는 부분
        //물론 Duck은 Animal을 상속받아야함
        for(Animal animal : animalArr){
            System.out.println("동물 울음 소리 테스트 시작");
            animal.sound();
            System.out.println("동물 울음 소리 테스트 종료");
        }

    }
}
