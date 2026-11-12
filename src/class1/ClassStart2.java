package class1;

public class ClassStart2 {
    static void main(String[] args) {
        String[] name = {"Kim", "Lee", "Chang"};
        int[] age = {10,9,8};
        int[] grade = {90,80,70};

        for(int i = 0; i < name.length; i++){ //name.length = 3
            System.out.println(name[i] + " " + age[i] + " " + grade[i]);
        }


        /*
        즉, 배열을 사용해서 코드를 최소화 하는데엔 성공했지만 한 학생의 데이터가 3개의 배열에 나눠져 있어서
        4번째 학생을 추가하기 위해서는 각각의 배열에 값을 일일히 채워 넣어 줘야함
        2번 학생을 지우기 위해서는 각각의 배열마다 사람이 정확히 두번째 요소에 지워야한다.
        사람이 관리하기 좋은 방식은 학생이라는 개념을 하나로 묶는것.
         */
    }
}
