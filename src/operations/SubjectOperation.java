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

    public void registerSubjects(Scanner scanner, StudentOperations studentOperation,SubjectOperation subjectOperation) {
        Student[] student=studentOperation.requestStudents();
        int bandera = studentOperation.checkStudents(studentOperation,scanner,student,subjectOperation);
        if(bandera==-1){
            System.out.println("----NO SE PUEDEN REGISTRAR MATERIAS----");
            return;
        }else{
            subjects = new Subject[serviceArraySubject.sizeArray(scanner)];
            for (int i = 0; i < subjects.length; i++) {
                serviceWriteSubject.writeData(scanner);
                subjects[i] = serviceWriteSubject.readData();
                student[bandera].setSubject(subjects);
                System.out.println("Calificacion de la materia:");
                Double cal = scanner.nextDouble();
                student[bandera].subject[i].setCalfs(cal.doubleValue());
            }
        }

    }

    public Subject[] requestSubjects() {
        return subjects;
    }

    public int countSubjects() {
        if(subjects==null){
            System.out.println("- NO HAY MATERIAS REGISTRADAS -");
            return 0;
        }else return subjects.length;
    }

    /*public void showSubjects(SubjectOperation subjectOperation){
        if(subjectOperation.requestSubjects()==null){
            System.out.println("no hay materias registradas");
            return;
        }else {
            for (Subject subject : subjectOperation.requestSubjects()) {
                System.out.println(" ");
                System.out.println(subject);
            }
        }
    }*/
}
