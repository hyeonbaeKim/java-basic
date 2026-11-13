package constructor;

public class MemberInitMain2 {
    static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        initMember(member1, "kim",32,100);

        MemberInit member2 = new MemberInit();
        initMember(member2,"leeChangMin",34,67);

        MemberInit[] members = {member1,member2};

        for(MemberInit member : members){
            System.out.println(member.name + " " + member.age + " " + member.grade);
        }
    }

    static void initMember(MemberInit member, String name, int age, int grade){
        member.name = name;
        member.age = age;
        member.grade = grade;
    }
    /*
    initMember를 사용해 반복을 제거했다. 근데 이 메서드는 대부분 MemberInit 객체의 멤버변수를 사용한다.
    이런 경우 속성과 기능을 한 곳에 두는 것이 더 나은 방법이다.
    쉽게 말해서 Member가 자기 자신의 데이터를 변경하는 메서드를 제공하는 것이 낫다.
     */
}
