package main;

import assignsubject.AssignSubject;
import grades.GradesOperations;
import operations.OperationAssign;
import operations.StudentOperations;

import operations.SubjectOperation;
import operations.TeacherOperation;
import operations.studentsServices.ServiceArrayStudent;
import operations.studentsServices.ServiceWriteStudent;
import operations.subjectsServices.ServiceArraySubject;
import operations.subjectsServices.ServiceWriteSubject;
import operations.teacherServices.ServiceArrayTeacher;
import operations.teacherServices.ServiceWriteTeacher;
import options.MenuMain;
import options.RegistrationMenu;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MenuMain menuMain = new MenuMain(new Scanner(System.in), new SubjectOperation(new ServiceArraySubject(), new ServiceWriteSubject()),
                new TeacherOperation(new ServiceArrayTeacher(), new ServiceWriteTeacher()),
                new StudentOperations(new ServiceArrayStudent(), new ServiceWriteStudent()),new GradesOperations());
        menuMain.menuPrincipal();

    }





}
