package operations.subjectsServices;

import pojo.Subject;

import java.util.Scanner;

public class ServiceWriteSubject {
    private Subject subject;
    public void writeData(Scanner scanner) {
        subject = new Subject();
        System.out.println("Id de la materia: ");
        String id = scanner.next();
        subject.setIdSubject(id);
        scanner.nextLine();
        System.out.println("Nombre de materia: ");
        String subjectName = scanner.nextLine();
        subject.setSubjectName(subjectName);
        System.out.println("Creditos de materia: ");
        int credits = scanner.nextInt();
        subject.setCredits(credits);
        scanner.nextLine();
    }

    public Subject readData() {
        return subject;
    }

}
