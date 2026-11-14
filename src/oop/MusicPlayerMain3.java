package oop;

import final1.Constant;

public class MusicPlayerMain3 {
    static void main(String[] args) {
        /*
        코드를 보면 중복되는 부분이 있다. 그리고 각각의 기능이 나중에 재사용 될 가능성이 있다.
        메서드를 사용해서 각각의 기능을 구분해보자.
        //볼륨증가
        data.volume++;
        System.out.println("볼륨증가");

        //볼륨증가
        data.volume++;
        System.out.println("볼륨증가");
         */

        MusicPlayerData data = new MusicPlayerData();

        //음악플레이어 켜기
        on(data);

        //볼륨증가
        volumeUp(data);

        //볼륨증가
        volumeUp(data);

        //볼륨감소
        volumeDown(data);

        //음악플레이어상태
        showDataStatus(data);

        //음악플레이어 끄기
        off(data);

        System.out.println(Constant.SECONDS_IN_MINUTE); //static final 상수 테스트
    }

    static void on(MusicPlayerData data){
        data.isOn = true;
        System.out.println("음악플레이어 실행");
    }
    static void off(MusicPlayerData data){
        data.isOn = false;
        System.out.println("음악플레이어 종료");
    }
    static void volumeUp(MusicPlayerData data){
        data.volume++;
        System.out.println("볼륨증가");
    }
    static void volumeDown(MusicPlayerData data){
        data.volume--;
        System.out.println("볼륨감소");
    }
    static void showDataStatus(MusicPlayerData data){
        if(data.isOn)
            System.out.println("음악플레이어 ON, 볼륨: " + data.volume);
        else
            System.out.println("음악플레이어 OFF");
    }

    /*
    메서드를 사용해서 각각의 기능 모듈화하면서 얻은 장점
        1.중복로직 삭제됌
        2.기능 수정 시 해당 메서드 내부만 수정하면 됌
        3.메서드 이름을 통해 해당 코드를 더 쉽게 이해할 수 있다.
     */

    /*
    지금까지 클래스를 사용해서 관련된 데이터를 하나로 묶고, 또 메서드를 사용해서 각각의 기능을 모듈화 했다,
    덕분에 깔끔하고 읽기 좋고, 유지보수 하기 좋은 코드를 작성할 수 있었다. 하지만 여기서 더 개선할 수는 없을까?

    우리가 작성한 코드의 한계는 바로 데이터와 기능이 분리되어 있다는 것이다.
    음악 플레이어의 데이터는 MusicPlayerData에 있는데 그 데이터를 사용하는 기능은 MusicPlayerMain3에 있는
    각각의 메서드에 분리되어 있다. 그래서 음악 플레이어와 관련된 데이터는 MusicPlayerData를 사용해야 하고,
    음악 플레이어와 관련된 기능은 MusicPlayerMain3의 각 메서드를 사용해야 한다.

    데이터와 그 기능을 사용하는 메서드는 매우 밀접하게 연관되어 있다. 각각의 메서드를 보면 MusicPlayerData의
    데이터를 사용한다. 따라서 이후에 관련 데이터가 변경되면 MusicPlayerMain3에 있는 각각의 메서드들도 함께
    변경되어야 한다. 그리고 이렇게 데이터와 기능이 분리되어 있으면 유지보수 관점에서도 관리해야 할 포인트가 2곳으로
    늘어난다.

    객체지향 프로그램이 나오기 전까지는 지금과 같이 데이터와 기능이 분리되어 있었다. 따라서 지금의 코드가 최선이었다.
    하지만 객체지향 프로그램이 나오면서 데이터와 기능을 온전히 하나로 묶어서 사용할 수 있게 되었다.
     */
}
