package final1;

public class FinalRefMain {
    static void main(String[] args) {
        final Data data = new Data(); //참조변수를 final로
        //data = new Data(); 이미 한번 할당해버려서 참조대상을 변경할 수 없어 오류

        //그러나 참조 대상의 값은 변경 가능 왜? final이 아니라서
        data.value = 10;
        data.value = 20;  
    }



}
