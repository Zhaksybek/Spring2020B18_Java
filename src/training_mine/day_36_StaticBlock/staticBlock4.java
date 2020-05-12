package training_mine.day_36_StaticBlock;

public class staticBlock4 {

    static String name;


    static {
        // as soon as class loaded
    name = "Cybertek School";

    }

    public static void main(String[] args) {
        System.out.println(name);


    }


}
