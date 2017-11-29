package module2.lab13.lab5;

import java.time.DayOfWeek;
import java.util.Arrays;
import java.util.Scanner;

public class TrainSchedule {
    private Train[] trains;
    private int index;

    public TrainSchedule(int number) {
        trains = new Train[number];
    }

    public void addTrain() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < trains.length; i++) {
            System.out.println("Enter number of " + (i + 1) + " train");
            int number = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter station of dispatch");
            String stationDispatch = scanner.nextLine();
            System.out.println("Enter station of arrival");
            String stationArrival = scanner.nextLine();
            System.out.println("Enter time of dispatch");
            String timeDispatch = scanner.nextLine();
            System.out.println("Enter time of arrival");
            String timeArrival = scanner.nextLine();
            System.out.println("How many times a week does the train go?");
            int counterOfTimes = Integer.parseInt(scanner.nextLine());

            DayOfWeek[] days = new DayOfWeek[counterOfTimes];

            System.out.println("Enter this days");
            for (int j = 0; j < counterOfTimes; j++) {
                days[j] = DayOfWeek.valueOf(scanner.nextLine());
            }

            trains[index] = new Train(number);
            trains[index].setStationArrival(stationArrival);
            trains[index].setStationDispatch(stationDispatch);
            trains[index].setTimeArrival(timeArrival);
            trains[index].setTimeDispatch(timeDispatch);
            trains[index].setDayOfWeeks(days);
            index++;
        }
    }

    public void printTrain() {
        for (Train train : trains) {
            System.out.println(train);
        }

    }

    public void searchTrain(String stationDispatch, String stationArrival, DayOfWeek dayOfWeek) {
        for (Train train : trains) {
            if (train.getStationArrival().equals(stationArrival) && train.getStationDispatch().equals(stationDispatch)) {
                for (DayOfWeek searchDay : train.getDayOfWeeks()) {
                    if (searchDay.equals(dayOfWeek)) {
                        System.out.println("Found train:\n" + train.toString());
                    }
                }
            }
        }
    }

    class Train {

        private int number;
        private String stationDispatch;
        private String stationArrival;
        private String timeDispatch;
        private String timeArrival;
        private DayOfWeek[] dayOfWeeks;

        public Train(int number) {
            this.number = number;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getStationDispatch() {
            return stationDispatch;
        }

        public void setStationDispatch(String stationDispatch) {
            this.stationDispatch = stationDispatch;
        }

        public String getStationArrival() {
            return stationArrival;
        }

        public void setStationArrival(String stationArrival) {
            this.stationArrival = stationArrival;
        }

        public String getTimeDispatch() {
            return timeDispatch;
        }

        public void setTimeDispatch(String timeDispatch) {
            this.timeDispatch = timeDispatch;
        }

        public String getTimeArrival() {
            return timeArrival;
        }

        public void setTimeArrival(String timeArrival) {
            this.timeArrival = timeArrival;
        }

        public DayOfWeek[] getDayOfWeeks() {
            return dayOfWeeks;
        }

        public void setDayOfWeeks(DayOfWeek[] dayOfWeeks) {
            this.dayOfWeeks = dayOfWeeks;
        }

        @Override
        public String toString() {
            return "Train: " +
                    "number - " + number +
                    ", stationDispatch - '" + stationDispatch + '\'' +
                    ", stationArrival - '" + stationArrival + '\'' +
                    ", timeDispatch - '" + timeDispatch + '\'' +
                    ", timeArrival - '" + timeArrival + '\'' +
                    ", dayOfWeeks - " + Arrays.toString(dayOfWeeks);
        }
    }
}
