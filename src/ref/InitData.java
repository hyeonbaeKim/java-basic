package ref;

public class InitData {
    int value1; //초기화 하지 않음
    int value2 = 10; //10으로 초기화
}

//지역변수는 항상 직접 초기화해줘야하는데
//멤버변수는 초기화하지 않으면 0, false, null등으로 초기화되고 초기화 직접 해줘도된다.
//c++도 멤버변수에 저렇게 직접 초기화
/*
class Person {
    int age = 10;   // ✅ C++11 이상이면 OK
};
 */
