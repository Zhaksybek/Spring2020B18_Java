package training_mine.MyLessonArrayLIST;

import java.util.ArrayList;
import java.util.Arrays;

public class tempor {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "Messi","John", "Loe","Ahmed",  "Messi","John", "Ahmed"));

        for (int i=list.size()-1; i>=0; i--){
            if (list.get(i).equals("Ahmed") || list.get(i).equals("Messi") || list.get(i).equals("John")){
                list.remove(list.get(i));
                System.out.println(list.size());
            }

        }

        System.out.println(list);


    }
}
