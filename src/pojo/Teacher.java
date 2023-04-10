package pojo;

public class Teacher extends Person {

    private String idTeacher;
    private String fieldOfStudy;
    private String academicDegree;

    public Teacher() {
        super();
    }

    public Teacher(String idTeacher, String name, String lastName, String gender, int age, String fieldOfStudy, String academicDegree) {
        super(name, lastName, gender, age);
        this.idTeacher = idTeacher;
        this.fieldOfStudy = fieldOfStudy;
        this.academicDegree = academicDegree;
    }

    public void setIdTeacher(String idTeacher) {
        this.idTeacher = idTeacher;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public void setAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }

    public String getIdTeacher() {
        return idTeacher;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }
    public String getAcademicDegree() {
        return academicDegree;
    }

    @Override
    public String toString() {
        return "Id: " + idTeacher
                + " " + super.toString()
                + " Campo de estudio: " + fieldOfStudy
                + " Grado academico: " + academicDegree;
    }
}
