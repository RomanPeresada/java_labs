package lab1_5.lab1_5_4;

public class PrintFirstNumbers {
    public static void main(String[] args) {
        int counter =0;
        for(int i=1;i<=300;i++)
        {
            if(i%3==0 || i%4==0)
            {
                System.out.println(i);
                counter++;
            }
            if(counter==10)
                break;
        }
    }
}
