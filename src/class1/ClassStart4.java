package class1;

public class ClassStart4 {
    static void main(String[] args) {
        Student student1;
        student1 = new Student();
        student1.name = "kim"; //x001.name = "kim";
        student1.age = 10;
        student1.grade = 90;

        Student student2 = new Student(); //Student() <- 인자가 없는 기본생성자 호출부분
        student2.name = "lee";
        student2.age = 9;
        student2.grade = 80;

        Student[] students = new Student[2]; //배열은 0으로 초기화, 객체는 null로 초기화
        //Student[] students = x005;
        students[0] = student1; //students[0] = x001; //x005[0] = x001;
        students[1] = student2; //students[1] = x002; //x005[1] = x001;
        //student1의 값이 바뀌면 students[0]의 값도 바뀐다 !!!!!!!!!!!!!!!!!!!!!!
        //!!!!!!!!!!!!!!!
        //!!!!!!!!!!!!!!!
        //!!!!!!!!!!!!!!!

        System.out.println(students[0].name + " " + students[0].age + " " + students[0].grade);
        System.out.println(students[1].name + " " + students[1].age + " " + students[1].grade);
        //students[0].name = x005[0].name = x001.name
    }
}
