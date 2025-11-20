package Classes.Tests;
import Classes.dominium.Student;


public class StudentTest01 {
    static void main(String[] args) {
        Student student = new Student();
        student.Name = "Luffy";
        student.Age = 14;


        System.out.println(student.Name);
        System.out.println(student.Age);
    }
}
