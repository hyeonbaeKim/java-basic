package poly.ex1;

public class AnimalSoundMain3 {

    static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        /*
        Cow[] cowArr = {dog,cat,cow};
        for(Cow cow : cowArr){
            System.out.println("동물소리 테스트 시작");
            cow.soundCow();
            System.out.println("동물소리 테스트 종료");
        }
         */
    }

    /*
    중복을 없애고자 배열화 하려고 해도 타입이 맞지 않아 배열도 못만듬
    뭐 cow,cow1,cow2등 cow배열들을 넣을 순 있겠지만 우리가 원하는 것은 서로 다른 타입들을 중복없이 한꺼번에
    관리하고 싶은것임
     */
}
