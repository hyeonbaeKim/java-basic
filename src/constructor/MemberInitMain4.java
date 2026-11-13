package constructor;

/*
프로그래밍을 하다보면 객체를 생성하고 바로 초깃값을 할당해야 하는 경우가 많다.
따라서 앞서 initMember와 같은 메서드를 매번 만들어야 한다.

그래서 대부분의 객체지향 언어에서는 객체를 생성하자마자 즉시 필요한 기능을 좀 더 편리하게 사용하고자
생성자라는 메서드를 도입했다.
 */
public class MemberInitMain4 {
    static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("Kim",32,100);
        MemberConstruct member2 = new MemberConstruct("LeeChangMin",34,67);

        MemberConstruct[] members = {member1,member2};

        for(MemberConstruct member : members){
            System.out.println(member.name + " " + member.age + " " + member.grade);
        }
    }
}

/*
생성자의 진짜 강점은 직접 정의한 생성자가 한개 혹은 오버로딩하여 여러개라면 무조건 하나를 호출해야한다.
(유령객체 막을 수 있음)
또 생성자를 사용하면 필수값 입력을 보장할 수 있게 된다.
좋은 프로그램은 무한한 자유도가 주어지는 프로그램이 아니라 적당한 제약이 있는 프로그램이다.
 */