package options;

import grades.GradesOperations;
import operations.StudentOperations;
import operations.SubjectOperation;
import operations.TeacherOperation;

import java.util.Scanner;

public class MenuMain {
    private final SubjectOperation subjectOperation;
    private final TeacherOperation teacherOperation;
    private final StudentOperations studentOperations;
    private final Scanner scanner;
    private final RegistrationMenu registrationMenu;
    private final GradesOperations gradesOperations;

    public MenuMain(Scanner scanner, SubjectOperation subjectOperation, TeacherOperation teacherOperation, StudentOperations studentOperations,GradesOperations gradesOperations) {
        this.scanner = scanner;
        this.subjectOperation = subjectOperation;
        this.teacherOperation = teacherOperation;
        this.studentOperations = studentOperations;
        this.gradesOperations = gradesOperations;
        registrationMenu = new RegistrationMenu();
    }


    public void menuPrincipal() {
        showOption();
        String menuOption = scanner.next();
        switch (menuOption) {
            case "Registrar","1"->
                    registrationMenu.registration(scanner, subjectOperation, teacherOperation, studentOperations,gradesOperations);
            case "Consultar","2" ->
                    QueryMenu.registrationAssignment(scanner, subjectOperation, teacherOperation, studentOperations,gradesOperations);
            default -> System.out.println("Opción invalida");
        }
        menuPrincipal();
    }


    private void showOption() {
        System.out.println("""
                ----------------------------------------------------------------------------\s
                Bienvenido al sistema de asignación de materias:\s
                Escriba la operación a realizar:
                1.- Registrar\s
                2.- Consultar""");
    }

}
