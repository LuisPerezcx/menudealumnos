package assignsubject;

import operations.services.ProcessString;

import java.util.Arrays;
import java.util.Scanner;

public class AssignSubject {
    private String idTeacher;
    private String [] idSubject;
    private AssignSubject assignSubject;

    public AssignSubject(String idTeacher, String [] idSubject) {
        this.idTeacher = idTeacher;
        this.idSubject = idSubject;
    }

    public String[] getIdSubject() {
        return idSubject;
    }

    public String getIdTeacher() {
        return idTeacher;
    }

    @Override
    public String toString(){
        return " Id de profesor asignado: " + idTeacher + " Id de materias: " + ProcessString.processString(Arrays.toString(idSubject));
    }
}
