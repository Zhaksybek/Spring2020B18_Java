package training_mine.Date_Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeMine {
    public static void main(String[] args) {
        DateTimeFormatter dtfUSA = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm a");
        DateTimeFormatter dtfKZ = DateTimeFormatter.ofPattern("dd/MMM/yy ");
        //DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MM-dd-yyyy hh:mm a");
        LocalDateTime dt = LocalDateTime.now();

        System.out.println(dt.format(dtfUSA));  //   2020-04-24T18:47:52.694  After formatting 04-24-2020 06:49 PM

        LocalDate locdate = LocalDate.of(1997,5,3);
        LocalTime locTime = LocalTime.of(19,52);

        LocalDateTime locDTime = LocalDateTime.of(locdate,locTime);
        System.out.println(locDTime.format(dtfUSA));  //  05-03-1997 07:52 PM   ==> 05/03/1997 07:52 PM


        LocalDate OljasBirht = LocalDate.of(1993,9,15);

        System.out.println("Oljas Akebay was born: "+OljasBirht.format(dtfKZ));






    }
}
