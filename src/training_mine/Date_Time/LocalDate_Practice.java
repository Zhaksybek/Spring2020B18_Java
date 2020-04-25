package training_mine.Date_Time;

import java.time.LocalDate;

public class LocalDate_Practice {
    public static void main(String[] args) {

        String[] relatives = {"Inju", "Altynbek", "Akerke"};

        LocalDate InjuBd = LocalDate.of(1999,10,2);
        LocalDate AltynbekBd = LocalDate.of(2002,2,4);
        LocalDate Akerke = LocalDate.of(1995,12,6);

        LocalDate[] birthDayArr = {InjuBd,AltynbekBd,Akerke};

        for (int i=0; i<relatives.length;i++){
            System.out.println(relatives[i]+"'s birthday is: "+birthDayArr[i]);
        }


    }
}
