package Classes.Tests;
import Classes.dominium.Teacher;

public class TeacherTest01 {
    static void main(String[] args) {
        Teacher teacher = new Teacher();

        teacher.Age = 30;
        teacher.Name = "Josh";
        System.out.println(teacher.Age);
        System.out.println(teacher.Name);
    }
}
