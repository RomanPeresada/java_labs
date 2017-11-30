package module2.lab14.lab1;

public class MyTuple<A,B,C> {
    private A a;
    private B b;
    private C c;

    public MyTuple(A a, B b, C c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public A getA(){
        return this.a;
    }

    public B getB() {
        return b;
    }

    @Override
    public String toString() {
        return "MyTuple{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    public C getC() {
        return c;
    }
}
