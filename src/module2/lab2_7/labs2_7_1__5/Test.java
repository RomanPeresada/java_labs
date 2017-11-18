package module2.lab2_7.labs2_7_1__5;

public class Test {
    public static void main(String[] args) {
        Device[] devices = new Device[2];
        devices[0] = new EthernetAdapter("ASUS",2300,"221ASD21",233,"YES");
        devices[1] = new Monitor("SAMSUNG",2123.6f,"QWEDf232",1600,900);

        for (Device device : devices) {
            System.out.println(device);
        }
    }
}
