package assigments.Methods;

public class As_2_4_AppearsTwice {
    public static void main(String[] args) {
        String target ="java";
        String sentence="java is fun java";
        String[] arr=sentence.split(" ");

            int count =0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].contains(target)) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(true);
            }else {
                System.out.println(false);
            }

        }


    public static boolean appearsTwice(String target, String sentence) {

        String[] arr=sentence.split(" ");
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(target)) {
                count++;
            }
        }
        if (count == 2) {
            return true;
        }

        return false;
    }


}
