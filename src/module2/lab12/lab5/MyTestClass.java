package module2.lab12.lab5;

public class MyTestClass {

    private MyInner myInner = new MyInner();

    public MyInner getMyInner() {
        return myInner;
    }


    public MyTestClass() {
        System.out.println("MyTestClass");
    }

    public static void main(String[] args) {

        MyTestClass myTestClass = new MyTestClass();

        System.out.println("B = " + myTestClass.getMyInner().B);
        System.out.println("A = " + MyTestClass.MyStaticNested.A);
        System.out.println();

        MyInner myInner = myTestClass.new MyInner();
        MyTestClass.MyStaticNested myStaticNested = new MyTestClass.MyStaticNested();
        new MyTestClass().methodForLocaleClass();
    }

    static class MyStaticNested {
        public static final int A = 12;

        public MyStaticNested() {
            System.out.println("MyStaticClass");
        }
    }

    class MyInner {
        public static final int B = 33;

        public MyInner() {
            System.out.println("MyInnerClass");
        }
    }

    void methodForLocaleClass() {
        class LocalClass {
            void print() {
                System.out.println("Local class");
            }
        }
        new LocalClass().print();
    }
}
