package constructor;

public class MemberInitMain3 {
    static void main(String[] args) {
        MemberInit2 member1 = new MemberInit2();
        member1.initMember("kim",32,100);

        MemberInit2 member2 = new MemberInit2();
        member2.initMember("LeeChangMin",34,67);

        MemberInit2[] members = {member1,member2};

        for(MemberInit2 member : members){
            System.out.println(member.name + " " + member.age + " " + member.grade);
        }
    }
}
