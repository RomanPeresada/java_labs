package lab2_2.lab2_2_4;

class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private int phoneNumber;

    public void setPerson(String firstName, int age) {
        this.age = age;
        this.firstName = firstName;

    }

    public void setPerson(String firstName, int age, int phoneNumber) {
        this.age = age;
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
    }

    public void setPerson(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setPerson(String firstName, String lastName, String gender) {

        this.firstName = firstName;
        this.gender = gender;
        this.lastName = lastName;
    }

    public void setPerson(String firstName, String lastName, int age, String gender, int phoneNumber) {
        this.age = age;
        this.firstName = firstName;
        this.gender = gender;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return ("First name is - " + firstName + "\nLast name is - " + lastName + "\nAge is " + age + "\nGender is - " + gender + "\nPhone number is - " + phoneNumber);
    }
}


public class WorkingWithPerson {
    public static void main(String[] args) {
        Person person = new Person();
        person.setPerson("Julia", 21, 3452);
        person.setPerson("Julia","Akteeva","Woman");
        person.setPerson("Max",19);
        person.setPerson("Mark","Yujo");
        person.setPerson("Julia","Martieva",26,"Woman",2341);
        System.out.println(person.toString());

    }
}
