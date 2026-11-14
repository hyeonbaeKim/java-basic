package final1;

public class ConstantMain1 {
    static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수 : " + 1000);
        int currentPeople = 999;
        increasePeople(currentPeople++);
        increasePeople(currentPeople++);
        increasePeople(currentPeople++);
    }

    static void increasePeople(int currentPeople){
        System.out.println("현재 프로그램 참여자 수 : " + currentPeople);
        if(currentPeople > 1000){
            System.out.println("게임에 참여할 수 없습니다. 대기자로 등록합니다.");
        } else {
            System.out.println("게임에 참여합니다.");
        }
    }
}
