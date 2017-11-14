package lab2_3;

public class Test {
    public static void main(String[] args) {
//        MyWindow win1 = new MyWindow();
//        MyWindow win2 = new MyWindow();
//        MyWindow win3 = new MyWindow();
//        MyWindow win4 = new MyWindow();
//        MyWindow win5 = new MyWindow();

//        win1.setColour("White");
//        win1.setHeight(3);
//        win1.setWidth(2);
//        win1.setNumberOfGlass(3);
//        win1.setOpen(true);
//
//        win2.setColour("Brown");
//        win2.setHeight(3.2);
//        win2.setWidth(1.2);
//        win2.setNumberOfGlass(2);
//        win2.setOpen(false);
//
//        win3.setColour("Black");
//        win3.setHeight(3.5);
//        win3.setWidth(2);
//        win3.setNumberOfGlass(2);
//        win3.setOpen(true);
//
//        win4.setColour("Orange");
//        win4.setHeight(1.7);
//        win4.setWidth(1.2);
//        win4.setNumberOfGlass(4);
//        win4.setOpen(true);
//
//        win5.setColour("Yellow");
//        win5.setHeight(4.3);
//        win5.setWidth(3.2);
//        win5.setNumberOfGlass(6);
//        win5.setOpen(false);

        MyWindow win1 = new MyWindow();
        MyWindow win2 = new MyWindow(3, 5);
        MyWindow win3 = new MyWindow(4, 2, 4);
        MyWindow win4 = new MyWindow(5, 2, 3, "Black");
        MyWindow win5 = new MyWindow(2.1, 3, 3, "Brown", false);

        MyWindow[] arrayOfWindows = new MyWindow[5];
        arrayOfWindows[0] = win1;
        arrayOfWindows[1] = win2;
        arrayOfWindows[2] = win3;
        arrayOfWindows[3] = win4;
        arrayOfWindows[4] = win5;

        win1.printFields();
        win2.printFields();
        win3.printFields();
        win4.printFields();
        win5.printFields();

    }
}
