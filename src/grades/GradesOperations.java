package grades;

import operations.StudentOperations;
import operations.SubjectOperation;
import pojo.Student;

import java.text.DecimalFormat;
import java.util.Scanner;

public class GradesOperations {
    public GradesOperations(){
    }
    private void fillArray(double[] subjects,Student[] student,int indice, int tam){
        for(int i=0; i<tam; i++){
            subjects[i]=student[indice].subject[indice].getCalfs();
        }
    }
    public void promedio(SubjectOperation subjectOperation, StudentOperations studentOperations, Scanner scanner){
        Student[] student = studentOperations.requestStudents();
        int indice = studentOperations.checkStudents(studentOperations,scanner,student,subjectOperation);
        int tam = subjectOperation.requestSubjects().length;
        double[] subjects = new double[tam];
        fillArray(subjects,student,indice,tam);
        double prom=0.0;
        for(int i=0;i<tam;i++){
            prom+=student[indice].subject[i].getCalfs()/tam;
        }
        System.out.println("El promedio general es: " + truncar(prom));
    }

    private String truncar(double numero) {
        DecimalFormat df = new DecimalFormat("#.0");
        return df.format(numero);
    }

}
