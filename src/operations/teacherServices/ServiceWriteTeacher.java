package operations.teacherServices;

import operations.services.ServiceWriteOperation;
import pojo.Person;
import pojo.Teacher;

import java.util.Scanner;

public class ServiceWriteTeacher extends ServiceWriteOperation {
    private Teacher teacher;
    public ServiceWriteTeacher() {
        super();
    }

    @Override
    public void writeData(Scanner scanner) {
        teacher = new Teacher();
        System.out.println("Id del profesor: ");
        String id = scanner.next();
        teacher.setIdTeacher(id);
        scanner.nextLine();
        System.out.println("Nombre: ");
        String name = scanner.nextLine();
        teacher.setName(name);
        System.out.println("Apellido: ");
        String lastName = scanner.nextLine();
        teacher.setLastName(lastName);
        System.out.println("Sexo: ");
        String gender = scanner.nextLine();
        teacher.setGender(gender);
        System.out.println("Edad: ");
        int age = Integer.parseInt(scanner.nextLine());
        teacher.setAge(age);
        System.out.println("Campo de estudio: ");
        String fieldOfStudy = scanner.nextLine();
        teacher.setFieldOfStudy(fieldOfStudy);
        System.out.println("Grado academico: ");
        String academicDegree = scanner.nextLine();
        teacher.setAcademicDegree(academicDegree);
    }

    @Override
    public Person readData() {
        return teacher;
    }
}
