package Metods.Test;
import Metods.Dominium.ImpressStudent;
import Metods.Dominium.Student;

public class StudentTest01 {


    static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student();
        ImpressStudent impress_information_students = new ImpressStudent();

        // STUDENT 1
        student01.name = "Tevo";
        student01.age = 18;
        student01.rm = 1;
        impress_information_students.impress(student01);

        // STUDENT 2
        student02.name = "NINA MACACA";
        student02.age = 16;
        student02.rm = 2;
        impress_information_students.impress(student02);




    }





}
