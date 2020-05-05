package training_mine.Predicate_mine;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Lamdda_expression {
    public static void main(String[] args) {

        // PREDICATE
        Predicate<Integer> oddNumber = x -> x % 2 != 0;

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        list.removeIf(oddNumber);

        System.out.println(list);  // [2, 4, 6, 8, 10]

        System.out.println("=================================================================");

        Predicate<Integer> lessThan5 = Y -> Y < 5;

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,-9,0,88,3,12,5,6,7,8,9,10));

        list2.removeIf(lessThan5);

        System.out.println(list2);  // ==> [5, 6, 88, 12, 5, 6, 7, 8, 9, 10]

        System.out.println("=================================================================");

        Predicate<String> removeUpperM = R -> R.startsWith("M") || R.startsWith("J");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Muha", "Tuka", "Sham", "Muradil", "Jack", "Manshuk"));

        System.out.println(names);

        names.removeIf(removeUpperM);

        System.out.println(names);

        System.out.println("=======>> CHARACTER <<======================================================");

        Predicate<Character> ch1 = c -> c >= 48 && c <=57;

        ArrayList<Character> chars = new ArrayList<>();

        chars.addAll(Arrays.asList('A', 'B', '3','4', '5', '6'));

        chars.removeIf(ch1);

        System.out.println(chars);






    }
}
