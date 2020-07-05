package training_mine.day52_Collection_Mine;

import java.util.PriorityQueue;
import java.util.Queue;

public class Q {
    public static void main(String[] args) {

        Queue<String> queue1 = new PriorityQueue<>();   // FIFO ==> first in first out

        queue1.add("D");
        queue1.add("A");
        queue1.add("C");
        queue1.add("B");


        System.out.println(queue1);

        String stringQ1 = queue1.poll();


        System.out.println(stringQ1);

        System.out.println(queue1);




    }
}
