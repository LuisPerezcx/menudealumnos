package operations;

import operations.studentsServices.ServiceArrayStudent;
import operations.studentsServices.ServiceWriteStudent;
import pojo.Student;

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
    public int showStudents(){
        if(students==null) {
            System.out.println("- NO HAY ALUMNOS REGISTRADOS -");
            return 0;
        }
        for (Student student : students) {
            System.out.println(" ");
            System.out.println(student);
            System.out.println("*******************************************************************");
        }
        return 1;
    }
}