package oop;

public class MusicPlayerMain1 {
    static void main(String[] args) {
        /*
        절차지향은 처리하는 데이터와 그 처리방식이 따로
        객체지향은 처리하는 데이터와 그 처리방식을 한 묶음으로
        */

        int volume = 0;
        boolean isOn = false;

        //음악플레이어 켜기
        isOn = true;

        //볼륨증가
        volume++;
        System.out.println("볼륨증가");

        //볼륨증가
        volume++;
        System.out.println("볼륨증가");

        //볼륨감소
        volume--;

        //음악플레이어상태
        if(isOn)
            System.out.println("음악플레이어 ON, 볼륨: " + volume);
        else
            System.out.println("음악플레이어 OFF");

        //음악플레이어 끄기
        isOn = false;
    }
}
