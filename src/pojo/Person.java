package pojo;

public class Person {
    //Atributos de la clase
    private String name;
    private String lastName;
    private String gender;
    private int age;

    //Constructor de la clase
    public Person() {
    }

    //Constructor de la clase sobrecargado por parametros (polimorfismo por sobrecarga de parametros)
    public Person(String name, String lastName, String gender, int age) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
    }

    //Métodos get y set

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //Sobreescritura del método toString polimorfirmo por anulación o sobreescritura
    @Override
    public String toString() {
        return " Nombre: " + getName()
                + " Apellido: " + getLastName()
                + " Genero: " + getGender()
                + " Edad: " + getAge();
    }

}
