package operations.services;
import pojo.Person;
import java.util.Scanner;

public class ServiceWriteOperation {
    private final Person person;
    public ServiceWriteOperation(){
        person = new Person();
    }
    public void writeData(Scanner scanner){
        System.out.println("Nombre: ");
        String name = scanner.nextLine();
        person.setName(name);
        System.out.println("Apellido: ");
        String lastName = scanner.nextLine();
        person.setLastName(lastName);
        System.out.println("Sexo: ");
        String gender = scanner.nextLine();
        person.setGender(gender);
        System.out.println("Edad: ");
        int age = Integer.parseInt(scanner.nextLine());
        person.setAge(age);
    }
    public Person readData(){
        return person;
    }

}
