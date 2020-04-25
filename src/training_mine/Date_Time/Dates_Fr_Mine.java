package training_mine.Date_Time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dates_Fr_Mine {
    public static void main(String[] args) {


        LocalDate mommyBirthday = LocalDate.of(1972,5,1);
        System.out.println(mommyBirthday); //1972-05-01

        boolean mommy = mommyBirthday.isLeapYear();
        System.out.println("Mommy birthday is Leap year: "+mommy);  //true

        String strMommyBd = mommyBirthday.toString();
        System.out.println(strMommyBd);  //1972-05-01

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");  //  01/05/1972

        String mbirthday = mommyBirthday.format(dtf);  // 01/05/1972
        System.out.println(mbirthday);











    }
}
