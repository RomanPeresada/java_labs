package module2.lab14.lab1;

public class Main {
    public static void main(String[] args) {
        MyTuple<String,Integer,Long> myTuple = new MyTuple<>("Ivan",13, 2398L);
        MyTuple<Double,String,String> myTuple1 = new MyTuple<>(7459.987,"Sophie","Ivanova");
        System.out.println(myTuple);
        System.out.println(myTuple1);

    }
}
