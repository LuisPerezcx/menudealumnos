package pojo;

public class Subject {
    private String idSubject;
    private String subjectName;
    private int credits;
    public double calfs;
    public Subject() {

    }

    public Subject(String idSubject, String subjectName, int credits) {
        this.idSubject = idSubject;
        this.subjectName = subjectName;
        this.credits = credits;
    }
    public void setCalfs(double cal){
        this.calfs = cal;
    }
    public double getCalfs(){
        return calfs;
    }
    public void setIdSubject(String idSubject) {
        this.idSubject = idSubject;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getIdSubject() {
        return idSubject;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public int getCredits() {
        return credits;
    }

    @Override
    public String toString() {
        return "Id: " + idSubject
                + " Nombre de la materia: " + subjectName
                + " Creditos de materia: " + credits
                + " Calificacion registrada: " + calfs;
    }
}




