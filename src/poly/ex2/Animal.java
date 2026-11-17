package poly.ex2;

/*
다형성을 사용하기 위해 상속 관계를 사용한다.
동물이라는 부모클래스(형이 같은 공통으로 처리될 수 있는)를 만들고 "sound 메서드를 재정의 할 목적"으로 정의한다.
dog,cat,cow는 animal을 상속 받는다. 그리고 각각 부모의 sound을 메서드 오버라이딩한다
 */
public class Animal {
    public void sound(){
        System.out.println("동물 울음 소리");
    }
}
