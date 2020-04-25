package training_mine.Date_Time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dates_Formatting {
    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
        LocalDate date = LocalDate.now();
        System.out.println(date.format(dtf));  //2020-04-23  ===> dtf ===> 2020/04/23 (ofPattern("yyyy/MM/dd");)

        System.out.println(date.format(dtf)); // 04/23/2020   ==>("MM/dd/yyyy");

        System.out.println(date.format(dtf)); //  Apr/23/2020

        // days_month_year

        System.out.println(date.format(dtf));  //  23/Apr/2020


        /*
        create a date call birthday: MMM/Days/years
        Ex: 2020 04 23
           Aprl/23/20
         */
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("EEE MMMM/dd/yy");

        LocalDate myBirthday = LocalDate.of(1993,12,18);
                         String str = myBirthday.format(dtf2);

        System.out.println(str);  //  Dec/18/93 ==> ("MMM/dd/yy");

        System.out.println(str);  // Sat December/18/93  ==> ("EEE MMMM/dd/yy");














    }
}
