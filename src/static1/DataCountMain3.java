package static1;

public class DataCountMain3 {
    static void main(String[] args) {
        Data3 data = new Data3("A");
        //System.out.println("A count = "+ data.count);
        System.out.println("A count = "+ Data3.count); //static변수는 객체가 갖는게 아니라 클래스가 공용으로 갖는다.

        Data3 data1 = new Data3("A");
        System.out.println("B count = "+ Data3.count);

        Data3 data2 = new Data3("A");
        System.out.println("C count = "+ Data3.count);

        //추가 인스턴스를 통한 접근
        Data3 data3 = new Data3("A");
        System.out.println("D count = "+ data3.count);
        //실제로 객체가 접근하는게 아니고 프로그램이 정적변수로 이해하여 클래스로 접근한다.
        //그래서 권장하지 않음. 저렇게 쓰면 아 이거 인스턴스 변수인가? 라고 생각이 들기 때문
    }


}
