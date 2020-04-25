package day28_DateTime;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalDate_Practice {
    public static void main(String[] args) {
        /*
        Warmup task:
	1. create an array of string, store five of your friends names in it
	2. create Array of localdates and store thier birthdays in the same order
	3. use for loop to print out your friends' names and thier birthdays
         */

        String[] friends = {"Margo", "Oljas", "Saia"};

        LocalDate MargoBirth = LocalDate.of(1993,2,25);
        LocalDate OljasBirth = LocalDate.of(1993,9,15);
        LocalDate SaiaBirth = LocalDate.of(1993,12,25);

        LocalDate[] birthdays = {MargoBirth, OljasBirth, SaiaBirth};

        for (int i=0; i < friends.length; i++){
                String name = friends[i];
                LocalDate Bd =    birthdays[i];

                System.out.println(name+"'s birthday is "+Bd);
        }









    }
}
