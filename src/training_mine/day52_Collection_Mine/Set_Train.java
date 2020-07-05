package training_mine.day52_Collection_Mine;

import com.sun.jmx.snmp.SnmpUnknownAccContrModelException;

import java.lang.reflect.Array;
import java.util.*;

public class Set_Train {
    public static void main(String[] args) {

        // Set does not accept duplicates

        Set<String> names = new HashSet<>();

        names.add("Saia");
        names.add("Malica");
        names.add("Oljeke");
        names.add("Jack");
        names.add("Malica");  // does not accepts duplicates

        System.out.println( names );

        System.out.println("========================");


        //String str = new String("A");  // set1.add(str);

        String[] arr = {  "C", "B",  "C", "D", "A","A", "A", "C"};

        LinkedHashSet<String> set1 = new LinkedHashSet<>(Arrays.asList(  arr ));

        System.out.println(  set1  );

        //  Set does not have index number

        // set1.get(0);  //


        System.out.println("======= Set =================");




        Set<Integer> numbers = new TreeSet<>();
        numbers.addAll(Arrays.asList( 10,20,6,4,9,8,7,4,6,3,21,0,1,5,4,6,7,9,4,1,4,5,0,0,0,6,4 ));

        System.out.println("TreeSet removed Duplicates and sorted:==> "+numbers);

        System.out.println("======= LinkedHashSet =================");

        Set<Integer> numbersLinkedHashSet = new LinkedHashSet<>();

        numbersLinkedHashSet.addAll(Arrays.asList( 10,20,6,4,9,8,7,4,6,3,21,0,1,5,4,6,7,9,4,1,4,5,0,0,0,6,4  ));
        System.out.println("LinkedHashSet removed duplicates and saved as it's :==> "+numbersLinkedHashSet);






    }
}
