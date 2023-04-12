package grades;

import operations.StudentOperations;
import operations.SubjectOperation;
import operations.studentsServices.ServiceArrayStudent;
import operations.studentsServices.ServiceWriteStudent;
import pojo.Student;
import pojo.Subject;

import java.util.Scanner;

public class Grades extends Subject {
    private int[] gradesSubjects;
    public void grades(StudentOperations students, SubjectOperation subjects){
        if(students.countStudents()==0|subjects.countSubjects()==0){
            return;
        }else{
            setGrades(students);
        }
    }
    private void setGrades(StudentOperations students){
        System.out.println("A que alumno deseas registrar calificaciones");
        students.showStudents();
    }
}
