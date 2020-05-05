package training_mine.Predicate_mine;

import Resources.Library;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class uniques {
    public static void main(String[] args) {

        Character[] chars = {'A','B','A','B','C','D','D','F'};

        ArrayList<Character> charList = new ArrayList<>(Arrays.asList(chars));

        System.out.println(charList);

        ArrayList<Character> result = new ArrayList<>(); // [B,C]

    for (int j=0; j<charList.size(); j++) {
        int count = 0;
        for (int i = 0; i < charList.size(); i++) {

            if (charList.get(i) == charList.get(j)) {
                count++;
            }
        }
        if (count == 1) {
            result.add(charList.get(j));
        }
    }

        System.out.println(result);











/*
    for (int i=0; i<charList.size();i++) {
        int count = Collections.frequency(charList, charList.get(i));
        if (count == 1) {
            result.add(charList.get(i));
        }
    }

        System.out.println(result);
*/






    }
}
