package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {

     public void call(){
         //부모의 기능을 어디까지 갖다 쓸 수 있나? -> 내꺼에서 찾아야지하다가 없으면 부모꺼
         publicValue = 1;
         protectedValue = 1; //상속관계 또는 같은 패키지
         //defaultValue = 1; //같은패키지만 가능
         //privateValue = 1;

         publicMethod();
         protectedMethod();
         //defaultMethod();
         //privateMethod();

         printParent(); //이거안에서는
         //defaultMethod();
         //privateMethod();
         //defaultValue = 1;
         //privateValue = 1; 호출가능. 같은 클래스 내부라서.
     }


}
