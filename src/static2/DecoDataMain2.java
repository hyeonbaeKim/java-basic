package static2;

//import static static2.DecoData.staticCall;
import static static2.DecoData.*;
/*
어떤 static을 자주 사용하는데 매번 붕어빵틀. 로 접근하기 귀찮을때 -> import static
 */

public class DecoDataMain2 {
    static void main(String[] args) {
        System.out.println("정적 호출");
        staticCall(); //staticValue = 1
        staticCall(); //staticValue = 2
        staticCall(); //staticValue = 3
        staticCall(); //staticValue = 4

        System.out.println("인스턴스 호출");
        DecoData data1 = new DecoData();
        data1.instanceCall(); //staticValue = 5, instanceValue = 1

        System.out.println("인스턴스 호출");
        DecoData data2 = new DecoData();
        data2.instanceCall(); //staticValue = 6, instanceValue = 2
        //라고 틀리게 생각함 .     //staticValue = 7, instanceValue = 1 <- 이게 맞다! 왜냐면 instanceValue는 Data2에 새롭게.

        staticCall(data1);
    }
}
