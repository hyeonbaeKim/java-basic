package oop;

public class MusicPlayerMain2 {
    static void main(String[] args) {
        /*
        음악플레이어와 관련된 데이터는 MusicPlayerData에 존재한다.
        이후에 프로그램 로직이 더 복잡해져서 다양한 변수들이 추가되더라도 음악플레이어에 관련 된 변수들은
        MusicPlayerData data객체에 속해 있으므로 쉽게 구분할 수 있다.
         */
        MusicPlayerData data = new MusicPlayerData();

        //음악플레이어 켜기
        data.isOn = true;

        //볼륨증가
        data.volume++;
        System.out.println("볼륨증가");

        //볼륨증가
        data.volume++;
        System.out.println("볼륨증가");

        //볼륨감소
        data.volume--;
        System.out.println("볼륨감소");

        //음악플레이어상태
        if(data.isOn)
            System.out.println("음악플레이어 ON, 볼륨: " + data.volume);
        else
            System.out.println("음악플레이어 OFF");

        //음악플레이어 끄기
        data.isOn = false;

    }
}
