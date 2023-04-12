package operations.studentsServices;

import operations.services.ServiceArrayOperation;
import operations.services.ServiceWriteOperation;
import pojo.Person;
import pojo.Student;

import java.util.Scanner;

public class ServiceWriteStudent extends ServiceWriteOperation {
    private Student student;
    public ServiceWriteStudent() {
        super();
    }

    @Override
    public void writeData(Scanner scanner) {
        student = new Student();
        System.out.println("Id ejemplo: ");
        String id = scanner.next();
        student.setIdStudent(id);
        scanner.nextLine();
        System.out.println("Nombre: ");
        String name = scanner.nextLine();
        student.setName(name);
        System.out.println("Apellido: ");
        String lastName = scanner.nextLine();
        student.setLastName(lastName);
        System.out.println("Sexo: ");
        String gender = scanner.nextLine();
        student.setGender(gender);
        System.out.println("Edad: ");
        int age = Integer.parseInt(scanner.nextLine());
        student.setAge(age);
        System.out.println("Semestre: ");
        int grade = Integer.parseInt(scanner.nextLine());
        student.setGrade(grade);
        System.out.println("Carrera: ");
        String collegeCareer = scanner.nextLine();
        student.setCollegeCareer(collegeCareer);
    }

    @Override
    public Person readData() {
        return student;
    }
}
