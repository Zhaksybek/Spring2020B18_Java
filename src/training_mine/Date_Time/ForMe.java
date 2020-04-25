package training_mine.Date_Time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ForMe {
    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE MM/dd/yyyy");

        LocalDate AbylaiKhan =LocalDate.of(1711,10,5);

        System.out.println("Khan Abylay was born: "+AbylaiKhan.format(dtf));



    }
}
