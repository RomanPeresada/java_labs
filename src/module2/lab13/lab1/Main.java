package module2.lab13.lab1;

public class Main {
    enum MyDayOfWeek {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY;

        public MyDayOfWeek nextDay() {
            switch (this.name()) {
                case "SUNDAY":
                    return MyDayOfWeek.MONDAY;
                case "MONDAY":
                    return MyDayOfWeek.TUESDAY;
                case "TUESDAY":
                    return MyDayOfWeek.WEDNESDAY;
                case "WEDNESDAY":
                    return MyDayOfWeek.THURSDAY;
                case "THURSDAY":
                    return MyDayOfWeek.FRIDAY;
                case "FRIDAY":
                    return MyDayOfWeek.SATURDAY;
                case "SATURDAY":
                    return MyDayOfWeek.SUNDAY;
                default:
                    return MyDayOfWeek.valueOf(this.name());
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Task 1 \n");
        for (MyDayOfWeek myDayOfWeek : MyDayOfWeek.values()) {
            System.out.println(myDayOfWeek);
        }
        System.out.println("\n Task 2 \n");

        String s = "My Java day: ";
        for (MyDayOfWeek myDayOfWeek : MyDayOfWeek.values()) {
            switch (myDayOfWeek.name()) {
                case "MONDAY":
                    System.out.println(s + myDayOfWeek.name());
                    break;
                case "WEDNESDAY":
                    System.out.println(s + myDayOfWeek.name());
                    break;
                case "FRIDAY":
                    System.out.println(s + myDayOfWeek.name());
                    break;
            }
        }

        System.out.println("\n Task 3 \n");
        MyDayOfWeek m1 = MyDayOfWeek.FRIDAY;
        MyDayOfWeek m2 = MyDayOfWeek.WEDNESDAY;
        System.out.println(m1.nextDay());
        System.out.println(m2.nextDay());
    }
}
