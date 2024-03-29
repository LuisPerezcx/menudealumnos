package options;

import grades.GradesOperations;
import operations.StudentOperations;
import operations.SubjectOperation;
import operations.TeacherOperation;
import pojo.Student;
import pojo.Subject;
import pojo.Teacher;

import java.util.Scanner;

public class QueryMenu {
    public static void registrationAssignment(Scanner scanner, SubjectOperation subjectOperation, TeacherOperation teacherOperation, StudentOperations studentOperations, GradesOperations gradesOperations) {
        showOption();
        String option = scanner.next();
        switch (option) {
            case "Alumnos","1" -> {
                int i=0;
                for (Student student : studentOperations.requestStudents()) {
                    System.out.println(" ");
                    System.out.println(student);
                    studentOperations.showSubjectsStudents(i);
                    System.out.println("*******************************************************************");
                    i++;
                }
            }
            case "Profesores","2" -> {
                for (Teacher t : teacherOperation.requestTeachers()) {
                    System.out.println(" ");
                    System.out.println(t);
                    System.out.println("*******************************************************************");
                }
            }
            case "Materias","3" -> {
                for (Subject subject : subjectOperation.requestSubjects()) {
                    System.out.println(" ");
                    System.out.println(subject);
                    System.out.println("*******************************************************************");

                }
            }
            case "Promedios","4" -> gradesOperations.promedio(subjectOperation,studentOperations,scanner);
            case "Regresar","5" ->
                    new MenuMain(scanner, subjectOperation, teacherOperation, studentOperations,gradesOperations).menuPrincipal();
            default -> System.out.println("Opción invalida");
        }
    }

    private static void showOption() {
        System.out.println("""
                Escriba la operación de consulta a realizar:\s
                1.- Alumnos \s
                2.- Profesores\s
                3.- Materias\s
                4.- Promedios\s
                5.- Regresar\s
                """);
    }

}
