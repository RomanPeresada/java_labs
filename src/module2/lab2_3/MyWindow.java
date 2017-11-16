package module2.lab2_3;

public class MyWindow {
    private double height;
    private double width;
    private int numberOfGlass;
    private String colour;
    private boolean isOpen;

    public MyWindow(){
        this.height = 2.2;
        this.width = 1.3;
        this.numberOfGlass = 5;
        this.colour = "White";
        this.isOpen = true;
    }


    public MyWindow(double height, double width) {
        this(height,width,5,"White",true);
    }

    public MyWindow(double height, double width, int numberOfGlass) {
        this(height,width,numberOfGlass,"White",true);
    }

    public MyWindow(double height, double width, int numberOfGlass, String colour) {
        this(height,width,numberOfGlass,colour,true);
    }

    public MyWindow(double height, double width, int numberOfGlass, String colour, boolean isOpen) {
        this.height = height;
        this.width = width;
        this.numberOfGlass = numberOfGlass;
        this.colour = colour;
        this.isOpen = isOpen;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setNumberOfGlass(int numberOfGlass) {
        this.numberOfGlass = numberOfGlass;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    @Override
    public String toString() {
        return "MyWindow{" +
                "height=" + height +
                ", width=" + width +
                ", numberOfGlass=" + numberOfGlass +
                ", colour='" + colour + '\'' +
                ", isOpen=" + isOpen +
                '}';
    }

    public void printFields() {
        System.out.println(toString());
    }
}
