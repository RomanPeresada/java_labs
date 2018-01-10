package module2.lab19;

public class Builder {

    private String firstName;
    private String secondName;
    private int age;
    private final String driverLayer;

    public Builder(String driverLayer) {
        this.driverLayer = driverLayer;
    }

    public Builder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public Builder setSecondName(String secondName) {
        this.secondName = secondName;
        return this;
    }

    public Builder setAge(int age) {
        this.age = age;
        return this;
    }
    public Driver build(){
        Driver driver = new Driver(driverLayer);
        driver.setAge(age);
        driver.setSecondName(secondName);
        driver.setFirstName(firstName);
        return driver;
    }
}
