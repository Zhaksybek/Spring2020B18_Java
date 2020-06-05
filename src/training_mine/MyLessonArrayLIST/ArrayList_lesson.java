package training_mine.MyLessonArrayLIST;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class ArrayList_lesson {
    public static void main(String[] args) {

         /*

        Each object in arrayList, has its own index number
        Unlike an array, ArrayList does not support primitives
        Unlike an array, ArrayList’ size is dynamic, it is automatically adjusted
        An ArrayList object automatically expands as items are added to it.
        In addition to adding items to an ArrayList, you can remove items as well.
        An ArrayList object automatically shrinks as items are removed from it.
         */

        // ArrayList is a class in the Java that is similar to an array and allows you to store objects.

        System.out.println("How add elements to ArrayList");

        ArrayList<Integer> list = new ArrayList<>();
        //  int   Integer

        // How add elements to ArrayList:
        //  1, 2, 3

        // FIRST method: add
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("list.add(1);\nlist.add(2);\n" +
                "list.add(3); method:==>  "+    list); // [1, 2,  3]
        //                                                 0  1   2

        System.out.println("=============================>");


//-----------------------------------------------------------------------------------


        System.out.println();

        // Second: add element by index: ==> list.add(index: 1, element: 4 )

        list.add(1,4);
        System.out.println("list.add(1,4) Add by index:==>  "+list);  //[1, 4, 2, 3 ]

        // Make sure right index:    ERROR:  list.add(index: 8, element: 4 )
        // list.add(8,9);
        // System.out.println(list);   OUT OF Bound

        System.out.println("=============================>");
//------------------------------------------------------------

        System.out.println();
        // Third: add collection :

        Integer[] arr = { 5,6,7,8 };

        list.addAll(Arrays.asList(  arr  ));

        System.out.println("list.addAll(Arrays.asList(  arr  )):==> "+list); //[1, 4, 2, 3, 5, 6, 7, 8]

        System.out.println("=============================>");





//---------------------------------------------------------------

        System.out.println();
        //  set(index, Object): replaces the original object at the given index with the new given object

        ArrayList<String> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList("Safar", "Steve" ,"Baha", "Aigerim", "Talha", "Akmammet", "Arafat", "Padier", "Vakhtang"));
        //                 index:   0          1       2         3          4        5           6       7          8

        //  How replace "Steve"  with "Jack"
        System.out.println("Before set method: ==> "+list2);
        //

        list2.set(1, "Jack" );

        System.out.println("After set method: ==>  "+list2); //

        System.out.println("=============================>");

//-----------------------------------------------------------------
        System.out.println();

        //   remove( index )
        //   remove( object )

        ArrayList<Character> list3 = new ArrayList<>();

        list3.addAll(Arrays.asList( 'A',  'B', 'C',  'j' ,  'D', 'u','E'  )); // remove index ==> 3
        //                           0     1     2    3      4    5

        System.out.println("Before remove index 3: ==> "+list3);
        list3.remove(3);

        System.out.println("After remove index 3: ==>  "+list3);

       System.out.println("======>");
        //  remove( object ) ==> 'u'
        //  list3.remove('u');    // WE CANT PUT OBJECT DIRECTLY
        //    System.out.println(list3);

        System.out.println("Before remove obj 'u': ==>  "+list3);

        Character obj = 'u';

        list3.remove(obj);
        System.out.println("After remove obj 'u' ==>    "+list3);


        System.out.println("=============================>");


//---------------------------------------------------------------
        System.out.println();

        System.out.println("Remove All even numbers: ==>  remove all method ");

        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(  9, 8, 7, 6, 77,  12,  3, 0,  3 , 1, 23, 54, 8, 56,4  ));

        System.out.println("\nBefore remove even numbers: ==>  "+list4);

        ArrayList<Integer> listEvenNumbers = new ArrayList<>();

        // How we can delete all even numbers:

        for (int i=0; i < list4.size(); i++){

            if ( list4.get(i) % 2 == 0){       // if statement for
                listEvenNumbers.add( list4.get(i)  );  // Collect all even numbers
            }
        }

        System.out.println("\nAll even numbers: ==>  "+ listEvenNumbers);


        list4.removeAll(listEvenNumbers);  //   THIS METHOD DELETED ALL EVEN NUMBERS

        System.out.println("\nAfter removing all even numbers: ==>  "+list4);



        System.out.println("=============================>");


        System.out.println("Sorting Array: ");

        ArrayList<Integer> list5 = new ArrayList<>(Arrays.asList(  3,2,4,6,8,0,1,7,9,6,4,5,6  ));
        // System.out.println( list5.containsAll(Arrays.asList(4,6,3,7,12)));

        System.out.println("Before sorting: ==> "+list5);
        //Arrays.sort(  );

        Collections.sort(  list5  ) ;   // HERE WE SORTED ARRAY LIST

        System.out.println("After sorting: ==>  "+list5);

        System.out.println("=============================>");
//-----------------------------------------------------------------------




    }
}
