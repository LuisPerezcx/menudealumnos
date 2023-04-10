package operations;

import assignsubject.AssignSubject;

import java.util.Scanner;

public class OperationAssign {
    private AssignSubject assignSubject;
    String[] idSubject;

    public void loadAssign(Scanner scanner) {
        int NUMBEROFSUBJECTS = 4;
        System.out.println("Indica el número de materias a asignar al profesor: ");
        int number = scanner.nextInt();
        if (number <= NUMBEROFSUBJECTS) {
            System.out.println("Indica el Id del profesor: ");
            String idTeacher = scanner.next();
            idSubject = new String[NUMBEROFSUBJECTS];
            for (int i = 0; i < NUMBEROFSUBJECTS; i++) {
                System.out.println("Ingresa el Id de las materias que seran cargadas al profesor: ");
                idSubject[i] = scanner.next();
            }
            assignSubject = new AssignSubject(idTeacher, idSubject);
        } else {
            System.out.println("El número maximo de materias para un profesor debe ser de 4");
            loadAssign(scanner);
        }
    }

    public AssignSubject showAssign() {
        return assignSubject;
    }
}
