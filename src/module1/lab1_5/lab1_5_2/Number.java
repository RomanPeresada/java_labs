package module1.lab1_5.lab1_5_2;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("If you want to do Switch - Enter \"s\"");
        System.out.println("If you want to do IF-ELSE - Enter \"i\"");

        String s =sc.nextLine();

        if(s.equals("s")) {
            System.out.println("Enter number: ");
            int x = Integer.parseInt(sc.nextLine());
            switch (x) {
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Other");
                    break;

            }
        }
        else if(s.equals("i"))
        {
            System.out.println("Enter number: ");
            int x = Integer.parseInt(sc.nextLine());
            if(x==1)
            {
                System.out.println("One");
            }
            else if(x==2)
            {
                System.out.println("Two");
            }
            else if(x==3)
            {
                System.out.println("Three");
            }
            else if(x==4)
            {
                System.out.println("Four");
            }
            else if(x==5)
            {
                System.out.println("Five");
            }
            else if(x==6)
            {
                System.out.println("Six");
            }
            else if(x==7)
            {
                System.out.println("Seven");
            }
            else if(x==8)
            {
                System.out.println("Eight");
            }
            else if(x==9)
            {
                System.out.println("Nine");
            }
            else
            {
                System.out.println("Other");
            }
        }
    }
}
