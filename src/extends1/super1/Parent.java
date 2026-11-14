package extends1.super1;
/*
부모와 자식의 필드명이나 메서드가 오버라이딩 되있다면, 자식에서 부모의 필드나 메서드를 호출할 수 없다.
이 때 super키워드를 통 부모를 참조할 수 있다.
 */
public class Parent {

    public String value = "Parent";

    public void hello(){
        System.out.println("Parent.Hello");
    }
}
