package training_mine.WrapperClass_ArrayListMine;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_PracriceMine {
    public static void main(String[] args) {

        ArrayList<String> nameList = new ArrayList<>();

        // add method:
                      nameList.add("Botagoz");
                      nameList.add("Jack");
                      nameList.add("Nazerke");
                      nameList.add("Aizhan");

        System.out.println(nameList);

        /*
                 create an ArrayList called studentNames
                 create Scanner object called scan



         */
        Scanner scan = new Scanner(System.in);
        ArrayList<String> studentNames = new ArrayList<>();
    while (true) {
        System.out.println("Enter a name");

        String name = scan.nextLine();
        studentNames.add(name);

        System.out.println("do u wanna another name");
        String answer = scan.nextLine();
        if (answer.equals("no")) {
            break;
        }
    }

        System.out.println(studentNames);





    }
}
