package module2.lab13.lab5;

import java.time.DayOfWeek;

public class Main {
    public static void main(String[] args) {
        TrainSchedule trainSchedule = new TrainSchedule(2);
        trainSchedule.addTrain();
        trainSchedule.printTrain();
        trainSchedule.searchTrain("Poltava","Kharkov", DayOfWeek.MONDAY);
    }
}
