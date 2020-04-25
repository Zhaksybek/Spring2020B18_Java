package day28_DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime_Formatting {
    public static void main(String[] args) {

        LocalDateTime datetime1 = LocalDateTime.of(2001,9,11,11,30,45);

        System.out.println(datetime1);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a, EEE");

        System.out.println(datetime1.format(dtf));  // 09/11/2001 11:30:45 AM, Tue




    }
}
