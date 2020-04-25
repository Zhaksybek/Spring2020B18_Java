package training_mine.Date_Time;

import day28_DateTime.DateTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time_FormattingMine {
    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm a");

        LocalTime time1 = LocalTime.of(00,40);
        System.out.println("I came back from work too late, it was: " +  time1.format(dtf));

        LocalTime time2 = LocalTime.of(18,6);
        System.out.println(time2.format(dtf));

        boolean result1 = time1.isAfter(time1);
        System.out.println(result1);






    }
}
