package training_mine.day53_iterableMapIntro;

import java.lang.reflect.Array;
import java.util.*;

public class Collection_Practice {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList( 1,2,3,4,5,6,4 ));

        list = Collections.synchronizedList(list);

        Set<Integer> set = new HashSet<>();

        set = Collections.synchronizedSet(set);

        System.out.println("==========================================");


        String[] arr = {"E", "B", "A", "D", "D", "C", "A"};

        LinkedHashSet<String> hashSet1 = new LinkedHashSet<>( Arrays.asList(arr) );

        TreeSet<String> treeSet1 = new TreeSet<>(Arrays.asList(arr));

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(arr));

        LinkedHashSet<String> hashSet2 = new LinkedHashSet<>(list1);



        System.out.println(treeSet1);

        System.out.println(hashSet1);

        /*

       String str = "";

        for (String each: hashSet1){
            str+= each;
        }

        System.out.println(str);

        */











    }

    public synchronized void append(){

    }


}
