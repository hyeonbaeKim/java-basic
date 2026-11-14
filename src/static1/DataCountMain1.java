package static1;

public class DataCountMain1 {
    static void main(String[] args) {
        Data1 data1 = new Data1("A");
        System.out.println("A count = " + data1.count); //1

        Data1 data2 = new Data1("A");
        System.out.println("B count = " + data2.count); //1

        Data1 data3 = new Data1("A");
        System.out.println("C count = " + data3.count); //1

        /*
        이 프로그램은 기대한대로 1,2,3으로 나오지 않는다.
        객체가 생성될 때마다 Data1 인스턴스는 새로 만들어진다. 그리고 Data1에 포함된 count도 새로 만들어지기 때문이다.
         */
    }
}
