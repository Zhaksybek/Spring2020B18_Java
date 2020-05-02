package training_mine.Predicate_mine;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionMethod {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,8,9,3,0,7,88,3,4,88,6,0));

        int max = Collections.max(list);
        int min =Collections.min(list);

        list.removeAll(Arrays.asList(max));
        list.removeAll(Arrays.asList(min));

        System.out.println("Max is: "+max + "\n Min is: "+min);

        int secondMax = Collections.max(list);
        int secondMin = Collections.min(list);



        System.out.println("Second Max is: "+secondMax + "\n Second Min is: "+secondMin);

        System.out.println("====SWAP method =====================================================");

        ArrayList<Integer> list3 = new ArrayList<>();

        list3.addAll(Arrays.asList(1,2,3,4,5));
        //                        0       4

        // Exp result==> (5,2,3,4,1)

        Collections.swap(list3,0,4);

        System.out.println(list3);

        System.out.println("========>> replaceAll <<========================================================");

        list3.addAll(Arrays.asList(1,2,3,2,4,5,2,2,2,3));

        Collections.replaceAll(list3,2,88);
        System.out.println(list3);

        System.out.println("======>>    <<==========================================================================");

        ArrayList<String> names = new ArrayList<>();

        names.addAll(Arrays.asList("Janna", "Medet", "Aidana","Janna", "Enlik", "Serikbolsyn", "Darhan","Janna"));

        /*
        names.set(0,"Araika");
*/

        Collections.replaceAll(names,"Janna","Araika");
        System.out.println(names);

        System.out.println("================================================================================");







    }
}
