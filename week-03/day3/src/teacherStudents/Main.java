package teacherStudents;

public class Main {
    public static void main(String[] args) {


        Student student = new Student();
        Teacher teacher = new Teacher();

        student.question(teacher);
        teacher.teach(student);

    }
}
/*
Instantiate a Student and Teacher object
Call the student's question() method and the teacher's teach() method*/