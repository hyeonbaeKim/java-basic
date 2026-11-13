package constructor;

public class MemberInitMain1 {
    /*
    객체를 생성하는 시점에 어떤 작업을 하고 싶다면 생성자를 이용하면 된다.
    생성자를 알아보기 전에 생성자가 왜 필요한지 코드로 확인해보자.
     */
    static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.name = "kim";
        member1.age = 32;
        member1.grade = 100;

        MemberInit member2 = new MemberInit();
        member2.name = "LeeChangMin";
        member2.age = 34;
        member2.grade = 67;

        MemberInit[] members = {member1,member2};

        for(MemberInit member : members){
            System.out.println(member.name + " " + member.age + " " + member.grade);
        }
        /*
        아마도 회원객체를 제대로 사용하기 위해서는 객체를 생성하자 마자 저렇게 초깃값을 설정해줘야 할 것이다.
        그러나 이 코드에서는 회원의 초깃값을 설정하는 부분이 반복된다. 메서드를 사용해서 반복을 제거해보자.
         */
    }
}
