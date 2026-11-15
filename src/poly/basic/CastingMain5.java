package poly.basic;

/*
다형성에서 참조형 변수는 이름 그대로 다양한 자식을 대상으로 참조할 수 있다. (부모는 자식을 품는다.)
그런데 참조하는 대상이 다양하기 때문에 어떤 인스턴스를 참조하는지 확인하려면 어떻게 해야할까?
instance of : 오른쪽타입이 왼쪽타입에 들어갈 수 있는지 대입해보면 된다.
 */
public class CastingMain5 {

    static void main(String[] args) {
        Parent parent1 = new Parent(); //(부모만 만들어진 객체)parent1이 참조하는 인스턴스는 Parent
        call(parent1); //else문 실행됌 -> new Parent instance of Child is false

        Parent parent2 = new Child(); //(부모와 자식 각각 따로 만들어진 객체)parent2가 참조하는 인스턴스는 Child
        call(parent2); //if문 실행됌 => new Child instance of Child is true
    }

    private static void call(Parent parent){
        if(parent instanceof Child){
            System.out.println("Child 인스턴스 맞음");
            Child child = (Child)parent; //다운캐스팅이지만 안정성을 확인한것.
            child.childMethod();
        }else{
            System.out.println("Child 인스턴스 아님");
        }
    }
    /*
    부모는 자식을 담을 수 있고 , 자식은 부모를 담을 수 없다.
    오른쪽에서 왼쪽으로 해석
    new Parent() instance of Parent is true
    new Child() instance of Parent is true
    new Parent() instance of Child is false
    new Child() instance of Child is true

     */
}
