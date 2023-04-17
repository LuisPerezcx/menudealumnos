package options;

import grades.GradesOperations;
import operations.StudentOperations;
import operations.SubjectOperation;
import operations.TeacherOperation;
import pojo.Student;

import java.util.Scanner;

public class RegistrationMenu {

    public void registration(Scanner scanner, SubjectOperation subjectOperation, TeacherOperation teacherOperation, StudentOperations studentOperations, GradesOperations gradesOperations) {
        showOption();
        String option = scanner.next();
        switch (option) {
            case "Alumnos","1" -> studentOperations.registerStudents(scanner);
            case "Profesores","2" -> teacherOperation.registerTeachers(scanner);
            case "Materias y Calificaciones","3" -> subjectOperation.registerSubjects(scanner,studentOperations,subjectOperation);
            case "Regresar","4" -> new MenuMain(scanner, subjectOperation, teacherOperation, studentOperations,gradesOperations).menuPrincipal();
            default -> System.out.println("Opción invalida");
        }
        registration(scanner, subjectOperation, teacherOperation, studentOperations,gradesOperations);
    }

    private static void showOption() {
        System.out.println("""
                Escriba la operación de registro a realizar:\s
                1.- Alumnos\s
                2.- Profesores\s
                3.- Materias y Calificaciones\s
                4.- Regresar\s
                """);
    }

}
