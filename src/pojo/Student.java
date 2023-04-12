package pojo;

public class Student extends Person {
    private String idStudent;
    private int grade;
    private String collegeCareer;
    public Subject subject[];

    //Constructores de la clase
    public Student() {
        super();
    }

    public Student(String idStudent, String name, String lastName, String gender, int age, int grade, String collegeCareer) {
        super(name, lastName, gender, age);
        this.idStudent = idStudent;
        this.grade = grade;
        this.collegeCareer = collegeCareer;
    }
    public void setSubject(Subject subject[]){
        this.subject=subject;
    }
    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setCollegeCareer(String collegeCareer) {
        this.collegeCareer = collegeCareer;
    }

    public String getIdStudent() {
        return idStudent;
    }

    public int getGrade() {
        return grade;
    }

    public String getCollegeCareer() {
        return collegeCareer;
    }

    @Override
    public String toString() {
        return "Id: " + idStudent
                + super.toString()
                + " Matricula: " + grade
                + " Carrera: " + collegeCareer;
    }
}
