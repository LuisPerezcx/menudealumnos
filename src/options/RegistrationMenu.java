package options;

import operations.StudentOperations;
import operations.SubjectOperation;
import operations.TeacherOperation;

import java.util.Scanner;

public class RegistrationMenu {

    public void registration(Scanner scanner, SubjectOperation subjectOperation, TeacherOperation teacherOperation, StudentOperations studentOperations) {
        showOption();
        String option = scanner.next();
        switch (option) {
            case "Alumnos" -> studentOperations.registerStudents(scanner);
            case "Profesores" -> teacherOperation.registerTeachers(scanner);
            case "Materias" -> subjectOperation.registerSubjects(scanner);
            case "Regresar" ->
                    new MenuMain(scanner, subjectOperation, teacherOperation, studentOperations).menuPrincipal();
            default -> System.out.println("Opción invalida");
        }
        registration(scanner, subjectOperation, teacherOperation, studentOperations);
    }

    private static void showOption() {
        System.out.println("""
                Escriba la operación de registro a realizar:\s
                1.- Alumnos\s
                2.- Profesores\s
                3.- Materias\s
                4.- Regresar\s
                """);
    }

}
