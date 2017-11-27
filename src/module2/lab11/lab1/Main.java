package module2.lab11.lab1;

public class Main {
    public static void main(String[] args) {
        try{
            throw new Exception("new exception!!!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I`m in block finally");
        }
    }
}
