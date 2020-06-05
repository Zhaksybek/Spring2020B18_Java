package training_mine.MyLessonArrayLIST;

import java.util.ArrayList;
import java.util.Arrays;

public class interview {
    public static void main(String[] args) {


      ArrayList<String> names1 = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "Messi", "Loe","Ahmed",  "Messi", "Ahmed"));

        names1.removeAll( Arrays.asList("Ahmed", "Messi" )  );
        System.out.println(names1);

//-------------------------------------------------------------------


        ArrayList<String> list = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "Messi","John", "Loe","Ahmed",  "Messi", "John", "Ahmed"));

        for (int  i =  list.size()-1; i>=0; i--){

            if (list.get(i).equals("Ahmed")   || list.get(i).equals("Messi")  ){

                list.remove(list.get(i));
                System.out.println(list.size());
            }

        }

        System.out.println(list);



//-------------------------------------------



//--------------------------------------------------------



      /*  ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(  "Madina",  "Ahmed",  "Ika",  "Zhaksybek",  "Ahmed"   ));

        for(int i = 0; i <= list.size()-1; i++){

            String characters = list.get(i);

            if(characters.contains("Ahmed")){
                list.remove("Ahmed");
            }
        }
        System.out.println(list);

        /*
        for (int  i =  list.size()-1; i>=0; i--){

            if (list.get(i).equals("Ahmed")   || list.get(i).equals("Messi")  ){

                list.remove(list.get(i));
                System.out.println(list.size());
            }

        }
         */



    }
}
