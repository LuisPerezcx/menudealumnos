package operations;

import operations.studentsServices.ServiceArrayStudent;
import operations.studentsServices.ServiceWriteStudent;
import pojo.Student;
import pojo.Subject;

import java.util.Arrays;
import java.util.Scanner;

public class StudentOperations {
    private Student[] students;
    private final ServiceWriteStudent serviceWriteStudent;
    private final ServiceArrayStudent serviceArrayStudent;

    //Inyectamos dependencias a través del constructor
    public StudentOperations(ServiceArrayStudent serviceArrayStudent, ServiceWriteStudent serviceWriteStudent) {
        this.serviceArrayStudent = serviceArrayStudent;
        this.serviceWriteStudent = serviceWriteStudent;
    }

    public void registerStudents(Scanner scanner) {
        students = new Student[serviceArrayStudent.sizeArray(scanner)];
        for (int i = 0; i < students.length; i++) {
            serviceWriteStudent.writeData(scanner);
            students[i] = (Student) serviceWriteStudent.readData();
        }
    }

    public Student[] requestStudents() {
        return students;
    }

    public int countStudents() {
        if(students==null){
            System.out.println("- NO HAY ALUMNOS REGISTRADOS -");
            return 0;
        }else return students.length;
    }
    public int showStudents(SubjectOperation subjectOperation){
        if(students==null) {
            System.out.println("- NO HAY ALUMNOS REGISTRADOS -");
            return 0;
        }
        int i=0;
        for (Student student : students) {
            System.out.println(" ");
            System.out.println(student);
            showSubjectsStudents(i);
            System.out.println("*******************************************************************");
            i++;
        }
        return 1;
    }
    public void showSubjectsStudents(int i){
        Subject[] subjects = students[i].getSubjectsStudent();
        System.out.println(Arrays.toString(subjects));
    }
    public int checkStudents(StudentOperations studentOperation,Scanner scanner, Student student[],SubjectOperation subjectOperation){
        System.out.println("ALUMNOS REGISTRADOS:");
        if(studentOperation.showStudents(subjectOperation)==0) {
            return -1;
        }
        System.out.println("ingresa el id del alumno al que deseas hacer la operacion");
        String id=scanner.next();
        int x=0;
        while (!id.equals(student[x].getIdStudent())){
            x++;
            if(x>=student.length){
                System.out.println("--NO SE ENCONTRO EL ID--");
                return -1;
            }
        }
        return x;
    }
}