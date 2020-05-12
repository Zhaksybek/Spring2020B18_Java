package assigments.As_05_07_2020;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Arrays_diving {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list= new ArrayList<>();
        //int count =1;
        for (int i=1; i<=7; i++){
            System.out.println("Enter score for judge "+i);
            Integer num =scan.nextInt();
            list.add(num);
        }

        System.out.println("Enter difficulty:");
        double diffic= scan.nextDouble();
        list.remove(Collections.min(list));
        list.remove(Collections.max(list));
        //Collections.sort(list);

        int sum = 0;
        for (int i=0;i<list.size();i++){
            sum += list.get(i);
        }

        double result = sum * diffic * 0.6;
        System.out.println(result);







       /* final int MAXIMUM_SCORES = 7;
        Scanner console = new Scanner(System.in);

        double divingScores[] = new double[MAXIMUM_SCORES];
        double difficulty;

        System.out.print("Please enter the difficulty level (1.2 - 3.8): ");
        difficulty = console.nextDouble();

        while(difficulty < 1.2 || difficulty > 3.8)
        {
            System.out.print("Please enter the valid difficulty level: ");
            difficulty = console.nextDouble();
        }

        for(int i = 0; i < MAXIMUM_SCORES; i++)
        {
            System.out.print("Enter the score of judge "
                    + (i + 1) + " (0 - 10): ");
            divingScores[i] = console.nextDouble();

            while(divingScores[i] < 1 || divingScores[i] > 10)
            {
                System.out.print("Enter the valid score of judge "
                        + (i + 1) + ": ");
                divingScores[i] = console.nextDouble();
            }
        }

        double minimum = divingScores[0];
        double maximum = divingScores[0];
        double total = 0;

        for(int i = 0; i < MAXIMUM_SCORES; i++)
        {
            if(divingScores[i] < minimum)
                minimum = divingScores[i];

            if(divingScores[i] > maximum)
                maximum = divingScores[i];

            total = total + divingScores[i];
        }

        total = total - maximum - minimum;
        total = total * difficulty;
        total = total * 0.6;

        System.out.printf("\nThe overall score for the dive: %.1f\n", total);

        */
    }
}
