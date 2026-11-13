package oop1;

public class MusicPlayerMain4 {
    static void main(String[] args) {
        MusicPlayer data = new MusicPlayer();

        //음악플레이어 켜기
        data.on();

        //볼륨증가
        data.volumeUp();

        //볼륨증가
        data.volumeUp();

        //볼륨감소
        data.volumeDown();

        //음악플레이어상태
        data.showStatus();

        //음악플레이어 끄기
        data.off();
    }
    /*
    MusicPlayer를 사용하는 입장에서는 MusicPlayer의 데이터인 volume과 isOn을 전혀 사용하지 않는다.
    MusicPlayer를 사용하는 입장에서는 MusicPlayer내부에 어떤 데이터가 있는지 전혀 몰라도 된다.
    MusicPlayer를 사용하는 입장에서는 단순하게 MusicPlayer가 제공하는 기능중에 필요한 기능을 호출해서
    사용하기만 하면 된다.

    또 MusicPlayer의 내부 코드가 변하는 경우에 다른 코드는 변경하지 않아도 된다.
    MusicPlayer의 volume이라는 필드 이름이 다른 이름으로 변한다고 할 때 MusicPlayer 내부만 변경하면 된다.
    또 음악플레이어가 내부에서 출력하는 메시지를 변경할 때도 MusicPlayer 내부만 변경하면 된다.
    이 경우 MusicPlayer를 사용하는 개발자는 코드를 전혀 변경하지 않아도 된다.
    물론 외부에서 호출하는 MusicPlayer의 메서드 이름을 변경하는 경우 MusicPlayer를 사용하는 곳의 코드는 변경해야 한다.
     */
}
