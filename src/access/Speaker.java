package access;
/*
접근제어자를 사용하면 해당 클래스 외부에서 특정 필드나 메서드에 접근하는 것을 허용하거나 제한할 수 있다.
예제를 통해 접근제어자가 왜 필요한지 알아보자.

스피커의 음량이 절대로 100이 넘어가면 안된다는 요구사항이 있다.
스피커 객체를 만든다. 음량 업, 다운, 현재음량 확인하는 기능
 */
public class Speaker {
    int volume;
    //private int volume;
    //으로 모든외부호출을  막을 수 있다. 해당클래스 내부에서만 접근가능하게 된다.

    Speaker(int volume){ //생성자를 통해 현재 음량값 지정
        this.volume = volume;
    }

    void volumeUp(){
        if(volume >= 100) {
            System.out.println("최대 음량입니다.");
        }
        else {
            volume += 10;
            System.out.println("음량을 10 증가합니다.");
        }
    }

    void showVolume(){
        System.out.println("volume = " + volume);
    }
}
