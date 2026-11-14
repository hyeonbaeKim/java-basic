package static1;
/*
외부에 카운트를 저장하는 별도의 객체 생성
이 객체를 공유해서 필요할 때마다 카운트 값을 증가시켜보자.
 */
public class DataCountMain2 {
    static void main(String[] args) {
        Counter counter = new Counter();

        Data2 data1 = new Data2("A",counter);
        System.out.println("A count = " + counter.count); //1

        Data2 data2 = new Data2("A",counter);
        System.out.println("B count = " + counter.count); //2

        Data2 data3 = new Data2("A",counter);
        System.out.println("C count = " + counter.count); //3

        //Counter인스턴스를 공용으로 사용한 덕분에 객체가 생성될 때마다 카운터를 정확히 증가시킬 수 있었다.
        //근데 Data2클래스에 관한건데 이 짓을 하기 위해 Counter라는 별도의 객체를 추가시켜야 한다.
        //생성자의 매개변수도 추가되고 생성자가 복잡해진다.
    }
}
