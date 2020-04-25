package training_mine.Date_Time;

import java.time.LocalDate;

public class Practice {
    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(2020,4,23);
        System.out.println(date1);

        LocalDate birthday = LocalDate.of(1993,12,18);
        System.out.println("Jake your birthday is: " +birthday);

        // isAfter(date2)
            boolean result = date1.isAfter(birthday);
        System.out.println(result); // true

        boolean result2 = birthday.isAfter(date1); //true


        // isBefore(date2)

        boolean result3 = date1.isBefore(birthday); //false
        System.out.println(result3);

        // is equal(date2)

        boolean result4 = date1.isEqual(birthday);
        System.out.println(result4);//false


        // is Leap year();
        boolean result5 = birthday.isLeapYear(); //false
        System.out.println("1993 is LeapYear: " +result5); //1993 is: false

        System.out.println("=============================================================");

        LocalDate now = LocalDate.now(); //  2020-04-23
        System.out.println("Today is: "+now); // Today is: 2020-04-23  is ==>  Gift Allah!

        String str ="" +now;
        System.out.println(str); //2020-04-23

        str=str.replace("-","/");
        System.out.println(str);

        // month/day/year

    }


}
