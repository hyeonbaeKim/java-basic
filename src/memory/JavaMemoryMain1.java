package memory;

/*
스택영역은 편의점 냉장고에 쌓여가는 음료수통이다. 먼저 넣은거 정리안하면 ㄹㅇ 평생 못끄냄
반대되는 개념이 큐이다 큐는 앞뒤가 뚫려있는 냉장고로 생각하자
 */

public class JavaMemoryMain1 {
    static void main(String[] args) {
        System.out.println("main start");
        method1();
        System.out.println("main end");
    }

    static void method1(){
        System.out.println("method1 start");
        method2();
        System.out.println("method1 end");
    }

    static void method2(){
        System.out.println("method2 start");
        System.out.println("method2 end");
    }
}

/*
main start
method1 start
method2 start
method2 end
method1 end
main end
 */
