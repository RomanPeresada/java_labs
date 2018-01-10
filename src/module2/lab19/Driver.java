package module2.lab19;

public class Driver {


    static class Builder {
        private String firstName;
        private String secondName;
        private Integer age;
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

        public Driver build() {
            Driver driver = new Driver(driverLayer);
            driver.age = this.age;
            driver.firstName = this.firstName;
            driver.secondName = this.secondName;
            return driver;
        }


    }


    private String firstName;
    private String secondName;
    private int age;
    private final String driverLayer;

    public Driver(String driverLayer) {
        this.driverLayer = driverLayer;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                ", driverLayer='" + driverLayer + '\'' +
                '}';
    }
}
