package operations;

import operations.subjectsServices.ServiceArraySubject;
import operations.subjectsServices.ServiceWriteSubject;
import pojo.Student;
import pojo.Subject;

import java.util.Scanner;

public class SubjectOperation {

    private Subject[] subjects;
    private final ServiceWriteSubject serviceWriteSubject;
    private final ServiceArraySubject serviceArraySubject;

    public SubjectOperation(ServiceArraySubject serviceArraySubject, ServiceWriteSubject serviceWriteSubject) {
        this.serviceArraySubject = serviceArraySubject;
        this.serviceWriteSubject = serviceWriteSubject;

    }


    public void registerSubjects(Scanner scanner, StudentOperations studentOperation) {
        Student student[]=studentOperation.requestStudents();
        int bandera = checkStudents(studentOperation,scanner,student);
        if(bandera==-1){
            System.out.println("----NO SE PUEDEN REGISTRAR MATERIAS----");
            return;
        }else{
            subjects = new Subject[serviceArraySubject.sizeArray(scanner)];
            for (int i = 0; i < subjects.length; i++) {
                serviceWriteSubject.writeData(scanner);
                subjects[i] = serviceWriteSubject.readData();
                student[bandera].setSubject(subjects);
            }
        }

    }
    public int checkStudents(StudentOperations studentOperation,Scanner scanner, Student student[]){
        if(studentOperation.showStudents()==0) {
            return -1;
        }
        System.out.println("A que alumno deseas registrar materias");
        System.out.println("ingresa el id del alumno al que quieres registrar materias");
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

    public Subject[] requestSubjects() {
        return subjects;
    }

    public int countSubjects() {
        if(subjects==null){
            System.out.println("- NO HAY MATERIAS REGISTRADOS -");
            return 0;
        }else return subjects.length;
    }
}
