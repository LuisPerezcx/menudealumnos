package operations;

import operations.teacherServices.ServiceArrayTeacher;
import operations.teacherServices.ServiceWriteTeacher;
import pojo.Teacher;

import java.util.Scanner;

public class TeacherOperation {
    private Teacher[] teacher;
    private final ServiceArrayTeacher serviceArrayTeacher;
    private final ServiceWriteTeacher serviceWriteTeacher;

    public TeacherOperation(ServiceArrayTeacher serviceArrayTeacher, ServiceWriteTeacher serviceWriteTeacher) {
        this.serviceArrayTeacher = serviceArrayTeacher;
        this.serviceWriteTeacher = serviceWriteTeacher;
    }

    public void registerTeachers(Scanner scanner) {
        teacher = new Teacher[serviceArrayTeacher.sizeArray(scanner)];
        for (int i = 0; i < teacher.length; i++) {
            serviceWriteTeacher.writeData(scanner);
            teacher[i] = (Teacher) serviceWriteTeacher.readData();
        }
    }

    public Teacher[] requestTeachers() {
        return teacher;
    }

    public int countTeachers() {
        return teacher.length;
    }
}
