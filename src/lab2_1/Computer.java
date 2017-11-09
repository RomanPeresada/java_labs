package lab2_1;

class ObjectComputer {
    private double frequency;
    private String model;
    private int power;
    private boolean isWorking;
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void addPercentToPrice(double percent) {
        percent /= 100;
        price *= percent;
    }


    public boolean isWorking() {
        return isWorking;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void view() {
        System.out.println("Frequency: "+frequency+"\nPower: "+power+"\nModel: "+model+"\nPrice: "+price+"\nisWorking: "+isWorking);
        System.out.println();
    }
}

public class Computer {
    public static void main(String[] args) {

        ObjectComputer[] arrayComputers = new ObjectComputer[5];
        for (int i = 0; i < 5; i++) {
            arrayComputers[i] = new ObjectComputer();
            arrayComputers[i].setPrice(1000*(i+1));
            arrayComputers[i].setModel("LG"+(i+1)*20);
            arrayComputers[i].setFrequency(2.1+(0.2)*i);
            arrayComputers[i].setWorking(true);
        }
        for (int i = 0; i < 5; i++) {
            arrayComputers[i].addPercentToPrice(10);
        }
        for(int i = 0; i < 5; i++)
        {
            arrayComputers[i].view();
        }

    }

}

