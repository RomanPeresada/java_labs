package module2.lab17.lab9_with_lock;

public class Main {
    public static void main(String[] args) {
        MyObject obj1 = new MyObject();
        MyObject obj2 = new MyObject();
        MyObject obj3 = new MyObject();
        Thread thread1 = new MyThread(obj1,obj2,obj3);
        Thread thread2 = new MyThread2(obj1,obj2,obj3);
        Thread thread3 = new MyThread3(obj1,obj2,obj3);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
