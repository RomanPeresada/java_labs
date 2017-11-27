package module2.lab11.lab2;

public class Main {
    public static void main(String[] args) {
        try{
            throw new MyException("Instance of MyException!!!");
        }catch (MyException e){
            System.out.println(e.getMessage());
        }

        try{
            MyTest myTest = new MyTest();
            myTest.test();
        }
        catch (MyException m){
            System.out.println(m.getMessage());
        }

        try{
            MyTest myTest = null;
            myTest.test();
        }
        catch (NullPointerException m){
            System.out.println(m.getMessage() + " Null pointer exception");
        }
        catch (Exception e){
            System.out.println(e.getMessage() + "Exception");
        }
    }
}
