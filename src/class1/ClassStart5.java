package class1;

public class ClassStart5 {
    static void main(String[] args) {
        Student student1;
        student1 = new Student();
        student1.name = "kim";
        student1.age = 10;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "lee";
        student2.age = 9;
        student2.grade = 80;

        Student[] students = {student1,student2}; //최적화!!!
        //Student[] students = new Student[]{student1,student2};

        for( int i = 0; i < students.length; i++) {
            System.out.println(students[i].name + " " + students[i].age + " " + students[i].grade);
        }

        for( int i = 0; i < students.length; i++) { //최적화!!
            Student s = students[i];
            System.out.println(s.name + " " + s.age + " " + s.grade);
        }

        for( Student s : students) { //최적화!!!!! iter <- 단축키
            System.out.println(s.name + " " + s.age + " " + s.grade);
        }
    }
}
