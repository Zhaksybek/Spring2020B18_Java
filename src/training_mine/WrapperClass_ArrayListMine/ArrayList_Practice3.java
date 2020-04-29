package training_mine.WrapperClass_ArrayListMine;

import java.util.ArrayList;

public class ArrayList_Practice3 {
    public static void main(String[] args) {

        // add(object):

        ArrayList<String> shoppingList = new ArrayList<>();

             shoppingList.add("apple");     // index: 0, size 1
             shoppingList.add("orange");
             shoppingList.add("grape");



        // two types of add method: add(index, object)
            shoppingList.add(1,"Strawberry");

            shoppingList.add(4,"Toyota Camry 55");

            // ArrayList we cannot skip element; So "continue" statement doesn't work

        System.out.println(shoppingList);

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(0,1);
        nums.add(1,5);
        nums.add(2,10);
        nums.add(3,15);
        // nums.add(0,1);   does not skip index

        System.out.println(nums);


        //get (index number): return theobject

        ArrayList<String> names = new ArrayList<>();
        names.add("Meerimjan");
        names.add("Jackson");
        names.add(1,"Taraz");
        names.add(1,"Shymkent");
        names.add(0,"Almaty");

        String str1 = names.get(1);  // none
        System.out.println(str1);    // "Meerimjan"

        // size(): return the length of the arrayList as an Int value
        int length = names.size();
        System.out.println(length);

        for (int i=0; i<names.size(); i++){
            String name = names.get(i);
            System.out.print(name+" ");
        }
        System.out.println();


        for ( String each  :  names ){
            System.out.print(each+" ");
        }
        System.out.println();
        System.out.println();


        // set(index number, object): the given object will replace the object at the

        ArrayList<String> city =new ArrayList<>();
             city.add("New York");
             city.add("San Francisco");
             city.add("San Jose");
             city.add("Almaty");

             city.set(2, "Astana");

        System.out.println(city);

        // contains method

        ArrayList<String> ayul = new ArrayList<>();

              ayul.add("Kegen");
              ayul.add("Tasashy");
              ayul.add("Karkara");
              ayul.add("Sargol");

              boolean result = ayul.contains("Tasashy");
        System.out.println(result);

        // equals

        boolean result2 = ayul.equals(city);  // false
        System.out.println(result2);

















    }
}
