package poly.basic;

public class CastingMain6 {
    static void main(String[] args) {

        Parent parent1 = new Parent(); //부모만 만들어진 객체
        call(parent1);

        Parent parent2 = new Child(); //(부모와 자식 각각 따로 만들어진 객체)
        call(parent2);
    }
    private static void call(Parent parent){
        //Child 인스턴스인 경우 childMethod(); 실행
        if(parent instanceof Child child){ // <- 자바 16부터 instance of 에 변수선언가능하여 업케스팅 생략
            System.out.println("Child 인스턴스 맞음");
            child.childMethod();
        }else{
            System.out.println("Child 인스턴스 아님");
        }
    }
}

