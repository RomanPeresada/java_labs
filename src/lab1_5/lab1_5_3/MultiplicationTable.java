package lab1_5.lab1_5_3;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.print("* | ");
        for(int i=1;i<=9;i++)
            System.out.print(i+" ");
        System.out.println();
        System.out.println("-------------------------");
        for(int i=1;i<=9;i++)
        {
            System.out.print(i+" | ");
            for(int j=1;j<=9;j++)
            {
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
    }
}
