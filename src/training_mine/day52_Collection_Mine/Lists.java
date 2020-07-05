package training_mine.day52_Collection_Mine;

import java.lang.reflect.Array;
import java.util.*;

public class Lists {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();

        list1.add(1);

        List<Integer> list2 = new LinkedList<>();
        list2.add(10);
        list2.remove(0);


        System.out.println("==================================");

        ArrayList<Integer> list3  = new ArrayList<>();
        list3.add(10);

        Vector<Integer> vector1 = new Vector<>();   //actions synchronized used for thread safety (one-by one)
        vector1.add(10);

        Stack<Integer> stack1= new Stack<>(); // Last in first out
        stack1.add(10);
        stack1.push(12);


        Stack<String> stackName = new Stack<>();


        stackName.add("Aizhan");
        stackName.add("Aiko");
        stackName.add("Zaika");
        stackName.add("Monica");
        stackName.add("Nazka");

        System.out.println(stackName);

        String name = stackName.pop();
        System.out.println(name);

        System.out.println(stackName);

        String name2 = stackName.pop();

        System.out.println(name2);

        System.out.println(stackName);








    }


}
