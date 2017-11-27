package module2.lab11.lab3;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        try {
            person.setFirstName("Alex");
            person.setLastName("Andreev");
            person.setAge(118);
            person.setAge(121);
            System.out.println(person.toString());
        }
        catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
