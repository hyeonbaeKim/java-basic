package poly.basic;

public class CastingMain3 {

    static void main(String[] args) {
        Child child = new Child(); //(부모와 자식 각각 따로 만들어진 객체)

        //업캐스팅 부모는 자식을 담을 수 있다.
        /*
        업캐스팅은 생략할 수 있다. 다운캐스팅은 생략할 수 없다.
        참고로 업캐스팅은 매우매우 자주 사용하기 때문에 생략이 권장된다.
        왜 업캐스팅은 생략할 수 있고 다운캐스팅은 직접 명시적으로 캐스팅 해야할까?
         */
        Parent parent1 = (Parent)child; //업캐스팅은 생략가능. 생략권장
        Parent parent2 = child;

        parent1.parentMethod();
        parent2.parentMethod();
    }
}
