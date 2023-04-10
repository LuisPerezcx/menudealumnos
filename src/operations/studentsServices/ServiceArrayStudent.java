package operations.studentsServices;

import operations.services.ServiceArrayOperation;
import java.util.Scanner;

public class ServiceArrayStudent extends ServiceArrayOperation {
    @Override
    public int sizeArray(Scanner scanner) {
        System.out.println("Ingresa el número de alumnos a registrar: ");
        return super.sizeArray(scanner);
    }
}
