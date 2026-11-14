package extends1.super1;

public class Child extends Parent{

     public String value = "Child";

     @Override
     public void hello(){
         System.out.println("Child.Hello");
     }

     public void call(){
         System.out.println("this value = " + this.value); //this생략가능 (현재 내 타입에서 찾는거)
         System.out.println("super value = " + super.value); //super는 부모타입

         this.hello();
         super.hello();
     }

}
