package constructor;

public class MemberConstructThis {
    String name;
    int age;
    int grade;

    MemberConstructThis(String name, int age){
        this(name,age,67);
        /*
        이 코드는 첫번째 생성자 내부에서 두번째 생성자를 호출한다. this()는 생성자 코드의 첫 줄에만 작성할 수 있다.
        this.name = name;
        this.age = age; 부분이 중복되서 코드 중복 방지를 위해 this() 사용
         */
    }

    MemberConstructThis(String name, int age, int grade){ //생성자는 반환타입이 없다 !!!!!!!!!!!!
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    /*
    c++ 스타일의 위임생성자
    class Member {
        private:
            std::string name;
            int age;
            int grade;
        public:
            Member(std::string name, int age, int grade)
                : name(name), age(age), grade(grade) {}

            Member(std::string name, int age)
                : Member(name, age, 0) {}   // ← 위임 생성자
    };
     */
}
