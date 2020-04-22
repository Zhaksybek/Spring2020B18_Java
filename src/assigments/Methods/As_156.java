package assigments.Methods;

public class As_156 {
    public static void main(String[] args) {
        String[] arr = { "a","foo","bar","foo","bla" };
        String t = "foo";

        int count =0;
        for (int i=0;i<arr.length;i++){
            if (arr[i].equals(t)){
                count++;
            }
        }
        System.out.println(count);




    }

    public static int count_appearance(String[] arr, String t){
        int count =0;
        for (int i=0;i<arr.length;i++){
            if (arr[i].equals(t)){
                count++;
            }
        }
        return count;


    }

}
