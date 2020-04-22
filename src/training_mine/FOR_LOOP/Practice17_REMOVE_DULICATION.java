package training_mine.FOR_LOOP;

public class Practice17_REMOVE_DULICATION {
    public static void main(String[] args) {

        String str ="abab";

        String result = "";
/*
        for (int i=0; i <=3; i++){
            if (!result.contains(""+str.charAt(i))){
                result += str.charAt(i);
            }

        }

        System.out.print(result);  */

        System.out.println("========================");

        for (int i=0; i <= 3; i++){

            if (result.contains(""+str.charAt(i))){
                continue;
            }
            result += str.charAt(i);

        }
        System.out.println(result);

//removes duplication
    }
}
