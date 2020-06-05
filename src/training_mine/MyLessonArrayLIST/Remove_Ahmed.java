package training_mine.MyLessonArrayLIST;

import java.util.ArrayList;
import java.util.Arrays;

public class Remove_Ahmed {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "Messi", "Loe","Ahmed",  "Messi", "Ahmed"));
        //                                                          0      1        2        3       4        5     6          7        8



             ArrayList<String> listNondup = new ArrayList<>();

        for (int i=0; i < names.size(); i++ ){
            if ( !names.get(i).equals("Ahmed")  ){
                listNondup.add(names.get(i));
            }
        }

        System.out.println(listNondup);

        System.out.println("================================================");









    }
}
