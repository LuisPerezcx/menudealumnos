package operations.teacherServices;

import operations.services.ServiceArrayOperation;

import java.util.Scanner;

public class ServiceArrayTeacher extends ServiceArrayOperation {
    @Override
    public int sizeArray(Scanner scanner) {
        System.out.println("Ingresa el número de profesores a registrar: ");
        return super.sizeArray(scanner);
    }
}
