package class1;

public class ClassStart3 {
    static void main(String[] args) {
        Student student1;
        student1 = new Student();
        //student1 = x001;
        //student1은 x001을 참조하게 된다. 포인팅하는 느낌
        //student1을 통해 실제 Student메모리에 참조(접근)할 수 있게 된다.
        //new Student()로 메모리는 만들어놨는데 student1을 통해 접근하는것!

        // Student* s1 = new Student();  <- c++스타일
        /*
        ****Java의 참조 변수는 내부적으로는 객체의 주소를 가지고 있어서 C++ 포인터와 거의 같은 역할을 합니다.****
        다만 언어가 주소를 직접 다루지 못하게 감춰 놓은 것입니다.
        */
        student1.name = "kim"; //x001.name = "kim";
        student1.age = 10;
        student1.grade = 90;

        Student student2 = new Student(); //Student() <- 인자가 없는 기본생성자 호출부분
        student2.name = "lee";
        student2.age = 9;
        student2.grade = 80;

        System.out.println(student1.name + " " + student1.age + " " + student1.grade);
        System.out.println(student2.name + " " + student2.age + " " + student2.grade);
    }
}
