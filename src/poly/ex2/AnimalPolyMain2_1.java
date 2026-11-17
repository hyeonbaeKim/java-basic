package poly.ex2;

public class AnimalPolyMain2_1 {
    static void main(String[] args) {
        Animal[] animalArr = {new Dog(), new Cat(), new Cow()};

        //Duck같은 동물이 추가되도 변하지 않는 부분
         //물론 Duck은 Animal을 상속받아야함
        for(Animal animal : animalArr){
            soundAnimal(animal);
        }
    }

    static void soundAnimal(Animal animal){
        System.out.println("동물 울음 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 울음 소리 테스트 종료");
    }
}

/*
아주 잘 작성된 코드 같아 보이지만 잠재적인 문제점이 있다.
1.Animal클래스를 생성할 수 있는 문제
Animal animal = new Animal(); 사실 이 클래스는 다형성을 위해서 필요한 것이지 직접 인스턴스를 사용할 일은 없다.
그치만 이렇게 생성된 클래스는 작동은 하지만 제대로 된 기능을 수행하지는 않는다.

2.sound()를 오버라이딩 하지 않을 수도 있는 문제
우리가 Animal클래스를 상속해서 Pig클래스를 만든다고 가정해보자. sound()를 오버라이딩해서 "꿀꿀"소리가 나오게 하고 싶다.
근데 개발자가 실수로 빼트렸다. 그러면 Animal의 sound를 상속받는다. 따라서 코드에 이상은 없지만 기능을 못할 수 있다.

--> 좋은 프로그램은 제약이 있는 프로그램이다.
 */