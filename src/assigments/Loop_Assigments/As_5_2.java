package assigments.Loop_Assigments;

public class As_5_2 {
    public static void main(String[] args) {
        String s= "COMEDIC";
        String result="";

        int j=0;
        for (int i=1; i<=s.length();i++){
            if (i%2!=0){
                result+=s.substring(j,j+1).toLowerCase();
            }else {
                result+=s.substring(j,j+1).toUpperCase();
            }
            j++;

        }
        System.out.println(result);






    }
}
