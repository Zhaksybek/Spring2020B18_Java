package day53_Iterable_Maps;

import javax.crypto.spec.PSource;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Iterating_Collections2 {

    public static void main(String[] args) {
        LinkedHashSet<String> names = new LinkedHashSet<>();
        names.addAll(Arrays.asList( "Mehmet", "Mohammed", "Yucel", "Sha",
                "Ozgur", "Ahmet", "Osmanj", "Ozgur", "Ozgur", "Ozgur", "Ozgur" , "Irina"   ) );
        System.out.println(names);

        Iterator<String> it = names.iterator();
        while( it.hasNext() ){
            String s = it.next();
            if(s.contains("m") || s.contains("M")){
                it.remove();
            }
        }

        System.out.println(names);


        System.out.println("=============================================");


        LinkedHashSet<String> students = new LinkedHashSet<>();
        students.addAll(Arrays.asList( "Mehmet", "Mohammed", "Yucel", "Jack",
                "Ozgur", "Ahmet", "Osmanj", "Ozgur", "Ozgur", "Ozgur", "Ozgur" , "Irina"   ) );



        for (Iterator<String> I =students.iterator(); I.hasNext(); ){

            String str = I.next();

            if ( str.contains("m") || str.contains("M")){
                I.remove();
            }
        }

        System.out.println(students);


        System.out.println("=============================================");

        LinkedHashSet<String> n = new LinkedHashSet<>();

        n.addAll(Arrays.asList( "Mehmet", "Mohammed", "Yucel", "Jack",
                "Ozgur", "Ahmet", "Osmanj", "Ozgur", "Ozgur", "Ozgur", "Ozgur" , "Irina"   ) );

        n.removeIf( s -> s.contains("m") || s.contains("M"));

        System.out.println(n);






    }






}
