package operations;

import operations.subjectsServices.ServiceArraySubject;
import operations.subjectsServices.ServiceWriteSubject;
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


    public void registerSubjects(Scanner scanner) {
        subjects = new Subject[serviceArraySubject.sizeArray(scanner)];
        for (int i = 0; i < subjects.length; i++) {
            serviceWriteSubject.writeData(scanner);
            subjects[i] = serviceWriteSubject.readData();
        }
    }

    public Subject[] requestSubjects() {
        return subjects;
    }

    public int countSubjects() {
        return subjects.length;
    }
}
