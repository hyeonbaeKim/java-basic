package static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue;

    public static void staticCall(){
        staticValue++; //붕어빵틀에 있는 함수가 붕어빵들에 있는 변수 접근 가능
        staticMethod(); //붕어빵틀에 있는 함수가 붕어빵들에 있는 함수 접근 가능

        //instanceValue++; //붕어빵틀에 있는 함수가 객체에 있는 변수 접근 불가능
        //instanceMethod(); //붕어빵틀에 있는 함수가 객체에 있는 함수 접근 불가능
        //왜? 붕어빵틀은 객체의 참조값 모름 -> instanceValue, instanceMethod() 모두 객체가 생성된 뒤 부를 수 있음
    }

    public void instanceCall(){
        staticValue++; //객체는 static 정적변수(붕어빵틀의 정적변수)에 접근가능 (공유가능)
        staticMethod(); //객체는 static 정적변수(붕어빵틀의 정적변수)에 접근가능 (공유가능)
        //인스턴스는 본인의 붕어빵틀을 알고있음*!!!

        //DecoData.staticValue++; Deco.이 생략된것
        //DecoData.staticMethod();

        instanceValue++;
        instanceMethod();
    }

    public static void staticCall(DecoData data){
        /*
        static함수 (붕어빵틀 함수)이지만 매개변수로 객체가 들어왔으므로 객체가 어딨는지 알게되서 객체에 접근가능
         */
        data.instanceCall();
        data.instanceMethod();
    }
    private void instanceMethod(){

    }

    private static void staticMethod(){

    }
}
