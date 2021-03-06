package day28_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {

        LocalDateTime dt = LocalDateTime.now();

        System.out.println(dt);  //  2020-04-24T08:22:48.553

        //LocalDateTime dt2 = LocalDateTime.of(LocalDate, LocalTime);

        // 2020-03-20    11:25:30

        LocalDate date = LocalDate.of(2020,3,20);
        LocalTime time = LocalTime.of(11,25,30);

        LocalDateTime dateTime = LocalDateTime.of(date, time);

        System.out.println(dateTime);  //2020-03-20T11:25:30

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate date2 = LocalDate.of(2019, 3,20);

        System.out.println(date2.format(dtf)); // 03/20/2019

       // DateTimeFormatter t1=DateTimeFormatter.ofPattern("dd MMMM yyyy hh:mm:ss");

      //  System.out.println(date2.format(t1));



    }
}
