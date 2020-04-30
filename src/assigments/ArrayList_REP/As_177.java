package assigments.ArrayList_REP;
import java.util.ArrayList;
public class As_177 {
    public static void main(String[] args) {
        ArrayList<Integer> nums =new ArrayList<>();
        nums.add(4);
        nums.add(-6);
        nums.add(3);
        nums.add(-8);
        nums.add(0);
        nums.add(4);
        nums.add(3);

        ArrayList<Integer> result = new ArrayList<>();






    }



    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> list){

        ArrayList<Integer> result = new ArrayList<>();

        int sum =0;

        for (Integer each : list){
            if (each>0){
                result.add(each);
                sum+=each;
            }

        }
        result.add(sum);
       return  result;


    }





}
