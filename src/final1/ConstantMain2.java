package final1;

public class ConstantMain2 {
    static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수 : " + Constant.MAX_USERS);
        int currentPeople = 999;
        increasePeople(currentPeople++);
        increasePeople(currentPeople++);
        increasePeople(currentPeople++);
    }

    static void increasePeople(int currentPeople){
        System.out.println("현재 프로그램 참여자 수 : " + currentPeople);
        if(currentPeople > Constant.MAX_USERS){
            System.out.println("게임에 참여할 수 없습니다. 대기자로 등록합니다.");
        } else {
            System.out.println("게임에 참여합니다.");
        }
    }
}

/*
앞의 예제는 최대 참여자 수가 2000으로 바뀌면 2번 수정해야하는데 지금 예제는 그냥 Constant클래스의 맥스 유저만 1번 수정하면된다.
 */
