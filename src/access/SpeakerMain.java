package access;

public class SpeakerMain {
    static void main(String[] args) {
        Speaker speaker = new Speaker(90);

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();
        System.out.println("프로젝트 끝");

        /*
        시간이 한참 지난 후, 히스토리를 모르는 새로운 개발자가 이어 받아 새로운 버전의 스피커를 개발하는데
        볼륨이 100이상 안올라가지는 걸 보고 소리를 더 높이고 싶어함.
        Speaker 클래스를 보니 volume 필드를 직접 사용할 수 있었다.
        volume을 200으로 설정하고 코드를 실행시킨 순간. 펑~
         */
        speaker.volume = 200;
        speaker.showVolume();

        /*
        Speaker객체를 사용하는 사용자는 Speaker의 volume필드와 메서드에 모두 접근할 수 있었다.
        앞서 volumeUp을 통해 음량이 100이 넘지못하도록 개발하였지만 소용이 없었다.왜냐하면 Speaker를 사용하는 입장에서는
        volume필드에서 원하는 값을 직접 설정할 수 있었기 때문
        이런 문제를 근본적으로 막기위해서는 volume필드에 외부접근을 근본적으로 막아야 한다.
        만약 volume이 애초부터 private였다면 새로운 개발자가 volume에 접근을 volumeUp으로만 했을테고 사고가 나는 일은
        없었을 것이다.
         */
    }
}
