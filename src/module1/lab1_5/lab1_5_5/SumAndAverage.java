package module1.lab1_5.lab1_5_5;

import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        System.out.println("Enter number that you want to get sum ");
        Scanner sc = new Scanner(System.in);
        int x =Integer.parseInt(sc.nextLine());
        int sum=0,counter=0;
        for(int i=1;i<=x;i++)
        {
            sum+=i;
            counter++;
        }
        double average = (double)sum/counter;
        System.out.println("The Sum is: "+sum);
        System.out.println("The Avg is: "+average);
    }
}
