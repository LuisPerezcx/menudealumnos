package operations.subjectsServices;

import operations.services.ServiceArrayOperation;

import java.util.Scanner;

public class ServiceArraySubject extends ServiceArrayOperation {
    @Override
    public int sizeArray(Scanner scanner) {
        System.out.println("Numero de materias a registrar: ");
        return super.sizeArray(scanner);
    }
}
