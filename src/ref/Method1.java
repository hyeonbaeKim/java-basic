package ref;

public class Method1 {
    static void main(String[] args) {
        Student student1 = new Student();
        student1 = new Student();
        student1.name = "kim";
        student1.age = 10;
        student1.grade = 90;
        initStudent(student1,"kim",10,90);


        Student student2 = new Student();
        student2.name = "lee";
        student2.age = 9;
        student2.grade = 80;
        initStudent(student2,"lee",9,80);

        System.out.println(student1.name + " " + student1.age + " " + student1.grade);
        System.out.println(student2.name + " " + student2.age + " " + student2.grade);
        printStudent(student1);
        printStudent(student2);
    }

    //참조형은 메소드를 호출할 때 참조값을 전달한다.따라서 메소드 내부에서 전달 된 참조값을 통해
    //객체의 값을 변경하거나 값을 읽어서 사용할 수 있다.
    static void initStudent(Student student, String name, int age, int grade){
        student.name = name;
        student.age = age;
        student.grade = grade;
    }
    static void printStudent(Student student){
        System.out.println(student.name + " " + student.age + " " + student.grade);
    }
}
