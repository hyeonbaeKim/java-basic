package final1;

public class FieldInit {

    static final int CONST_VALUE = 10;
    //자바에서 static final이 붙으면 대문자로 쓰는것이 관례

    final int value = 10;

    public FieldInit(int value) {
        //this.value = value; 이미 10으로 값 할당되어있어서 생성자에서 값을 변경시키는것 에러
    }
}
