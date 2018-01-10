package module2.lab19;

public class TestBuilder {

    public static void main(String[] args) {
     Driver driver = new Driver.Builder("AX3242").setSecondName("Peresada").setAge(21).setFirstName("Sophie").build();
     System.out.println(driver);

     Driver secondDriver = new Builder("SecondNmae").setSecondName("sd").setAge(213).build();
        System.out.println(secondDriver);
    }
}
