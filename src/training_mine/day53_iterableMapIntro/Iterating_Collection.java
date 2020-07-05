package training_mine.day53_iterableMapIntro;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Iterating_Collection {

    public static void main(String[] args) {

        //ArrayList<Integer> list = new ArrayList<>(Arrays.asList( 1,1,1,2,2,3,3,4,4,6,5,6,5,4,9 ));

       // list.removeIf(p -> (p < 4) || p<=4 ); // uses the iterator interface internally
       // System.out.println(list);

        System.out.println("=========================");

        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList( 5,1,1,1,2,2,3,3,4,4,6,5,6,5,4,9 ));
        Iterator<Integer> iterator1  = list3.iterator();

        while (iterator1.hasNext()){ // how works iterator explicity
            if (iterator1.next()<4){
                iterator1.remove();
            }
        }
        System.out.println(list3);

        System.out.println("=========================");

        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList( 5,1,1,1,2,2,3,3,4,4,6,5,6,5,4,9 ));


        for (   Iterator<Integer> I =list4.iterator(); I.hasNext();  ){
                int num = I.next();
            if ( num < 4 ){
                I.remove();
            }

        }

        System.out.println(  list4 );




        //System.out.println( iterator1.hasNext() );
        //System.out.println( iterator1.next() );

        /*   boolean bool1 = iterator1.hasNext();

        System.out.println(bool1);



         */




    }

}
