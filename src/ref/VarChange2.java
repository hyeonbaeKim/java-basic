package ref;

public class VarChange2 {
    static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;

        System.out.println("dataA.value = " + dataA.value + ", " + "dataB.value = " + dataB.value);
        //둘 다 10

        dataA.value = 20;
        System.out.println("dataA.value값 변경");
        System.out.println("dataA.value = " + dataA.value + ", " + "dataB.value = " + dataB.value);
        //둘 다 20

        dataB.value = 30;
        System.out.println("dataB.value값 변경");
        System.out.println("dataA.value = " + dataA.value + ", " + "dataB.value = " + dataB.value);

    }
}
