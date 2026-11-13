package oop1;

/*
oop에서 개발한 음악 플레이어는 데이터와 기능이 분리되어 있었다. 이제 데이터와 기능을 하나로 묶어서 음악 플레이어라는
개념을 온전히 하나의 클래스에 담아보자.
지금부터 우리는 음악 플레이어를 개발하는 개발자가 될 것이다.
음악플레이어를 만들어서 제공하는 개발자와 음악 플레이어를 사용하는 개발자가 있다고 생각하자.

*/
public class MusicPlayer {
    int volume = 0;
    boolean isOn = false;

    void on(){
        isOn = true;
    }
    void off(){
        isOn = false;
    }
    void volumeUp(){
        volume++;
    }
    void volumeDown(){
        volume--;
    }
    void showStatus(){
        if(isOn)
            System.out.println("음악 플레이어가 켜져있습니다. 볼륨은: " + volume);
        else
            System.out.println("음악 플레이어가 꺼져 있습니다.");
    }

    /*
    MusicPlayer클래스에 음악 플레이어에 필요한 모든 데이터와 기능을 정리했다.
    이제 음악플레이어가 필요한 곳에서 이 클래스만 있으면 온전한 음악 플레이어를 사용할 수 있게 된다.
     */
}
