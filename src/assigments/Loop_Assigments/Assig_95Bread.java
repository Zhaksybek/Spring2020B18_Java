package assigments.Loop_Assigments;
import java.util.Scanner;
public class Assig_95Bread {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String str2 = str;
        int count =0;
        if (!str.contains("bread")){
            System.out.println("nothing");
            System.exit(0);
        }


        while (str.contains("bread")){
            count++;
            str=str.replaceFirst("bread", "");
        }

        if (count>1){

            if (str2.startsWith("bread")&&str2.endsWith("bread")){
                str2 = str2.replace("bread","");
                System.out.println(str2);
            }else {
                str2=str2.substring(7,str2.length()-7);
                System.out.println(str2);
            }

        }else {
            System.out.println("nothing");
        }



    }
}
