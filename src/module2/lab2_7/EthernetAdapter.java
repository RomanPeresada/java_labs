package module2.lab2_7;

public class EthernetAdapter extends Device {
    private int speed;
    private String mac;

    public EthernetAdapter(String manufacturer, float price, String serialNumber, int speed, String mac) {
        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EthernetAdapter that = (EthernetAdapter) o;

        if (speed != that.speed) return false;
        return mac != null ? mac.equals(that.mac) : that.mac == null;
    }

    @Override
    public int hashCode() {
        int result = speed;
        result = 31 * result + (mac != null ? mac.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "EthernetAdapter: " + "manufacturer = " + getManufacturer() + ", price = " + getPrice() +
                ", Serial number = " + getSerialNumber() + "speed = " + speed + ", mac = " + mac;
    }
}
