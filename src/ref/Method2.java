package ref;

public class Method2 {
    static void main(String[] args) {
        Student student3 = createStudent("kim",10,90);
        Student student4 = createStudent("lee",9,80);

        printStudent(student3);
        printStudent(student4);
    }
    static void printStudent(Student student){
        System.out.println(student.name + " " + student.age + " " + student.grade);
    }

    //객체 반환
    static Student createStudent(String name, int age, int grade){
        Student student = new Student(); //x001
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student; //x001
    }
}
